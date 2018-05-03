#include <stdio.h>
#include <omp.h>

int main(int argc, char const *argv[])
{
	omp_set_num_threads(3);

	#pragma omp parallel
	{
		id = omp_get_thread_num();

		printf("I am a Progammer(%d)\n", id);
	}

	return 0;
}