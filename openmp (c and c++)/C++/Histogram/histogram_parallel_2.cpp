#include <stdio.h>
#include <omp.h>
#include <map>
#include <pthread.h>
using namespace std;


pthread_mutex_t key;

int main(int argc, char const *argv[])
{
	int data[100];

	#pragma omp for
	for (int i = 0; i < 100; ++i)
	 {
	 	data[i] = rand() % 6; 
	 } 

	map<int,int> bins;

	int length = 100;

	#pragma omp parallel for
	for (int i = 0; i < length; ++i)
	{
		pthread_mutex_lock(&key);

		if(bins.count(int(data[i])) == 0)
		{
			bins[data[i]] = 1;
		}
		else
		{
			bins[data[i]]++;
		}

		pthread_mutex_unlock(&key);
	}	




	map<int,int>:: iterator m;

	for (m = bins.begin(); m != bins.end(); ++m)
	{
		printf("the size of bin %d is %d\n",m->first, m->second);
	}


	return 0;
}