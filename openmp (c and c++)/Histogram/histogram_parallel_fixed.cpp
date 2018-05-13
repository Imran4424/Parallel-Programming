#include <stdio.h>
#include <omp.h>
#include <map>
#include <pthread.h>
using namespace std;


pthread_mutex_t key;

int main(int argc, char const *argv[])
{
	int data[] = {1,0,3,2,5,2,3,4,1,0,2,1,3,4,5,5,5,3,2,1,1,1,0,0,0,2,1,0,1,2,3,5,5,5,3,5,3,5,0,5,5,4,5,4,4,5};

	map<int,int> bins;

	int length = (int) sizeof(data)/ sizeof(data[0]);

	printf("%d\n", length);

	#pragma omp parallel for num_threads(6)
	for (int i = 0; i < length; ++i)
	{
		pthread_mutex_lock(&key);

		printf("Thread id %d\n", omp_get_thread_num());

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