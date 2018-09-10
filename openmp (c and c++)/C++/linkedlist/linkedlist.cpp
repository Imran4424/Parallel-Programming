#include <iostream>
#include <omp.h>
#include <stdio.h>
#include <stdlib.h>
using namespace std;

struct node
{
	int data;
	node* nextAddress;
};

omp_lock_t writelock; // global variable

node* head = NULL; //global variable;




void insertNode()
{
	node* temp = new node();

	temp -> data = rand() % 50 + 1;
	temp -> nextAddress = NULL;

	
	
	
	omp_set_lock(&writelock);
	if (head == NULL)
	{
		head = temp;
	}
	else
	{
		node* travel = head;

		while(travel -> nextAddress != NULL)
		{
			travel = travel -> nextAddress;
		}

		travel -> nextAddress = temp;
	}
	omp_unset_lock(&writelock);

}

void Display()
{
	node* travel = head;

	while(travel != NULL)
	{
		cout<<travel -> data<<" ";

		travel = travel -> nextAddress;
	}

	cout<<endl;
}


int main(int argc, char const *argv[])
{
	omp_init_lock(&writelock);

	cout<<"how many node you want to insert"<<endl;

	int num;
	cin>>num;

	omp_set_num_threads(num);

	#pragma omp parallel
	{
		insertNode();
	}

	Display();

	omp_destroy_lock(&writelock);
	return 0;
}