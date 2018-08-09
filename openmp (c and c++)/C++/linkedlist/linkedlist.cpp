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

node* head = NULL; //global variable;

void init()
{
	node* temp = new node();

	temp -> data = rand() % 50 + 1;
	temp -> nextAddress = NULL;	

	head = temp2;

}

omp_lock_t writelock; // global variable

void insertNode()
{
	node* temp = new node();

	temp -> data = rand() % 50 + 1;
	temp -> nextAddress = NULL;

	omp_init_lock(&writelock);
	#pragma omp critical
	{
		node* travel = head;
		
		if (travel == NULL)
		{
			travel = temp;
		}
		else
		{
			while(travel -> nextAddress != NULL)
			{
				travel = travel -> nextAddress;
			}

			travel -> nextAddress = temp;
		}
	}
	omp_destroy_lock(&writelock);

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
	init();

	cout<<"how many node you want to insert"<<endl;

	int num;
	cin>>num;

	omp_set_num_threads(num - 1);

	#pragma omp parallel
	{
		insertNode();
	}

	Display();

	return 0;
}