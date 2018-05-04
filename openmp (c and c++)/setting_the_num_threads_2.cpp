#include <stdio.h>
#include <omp.h>


int main(int argc, char const *argv[])
{
	
	#pragma omp parallel num_thread(3)
	{
		int id = omp_get_thread_num();

		printf("I am a Progammer(%d)\n", id);
	}

	return 0;
}