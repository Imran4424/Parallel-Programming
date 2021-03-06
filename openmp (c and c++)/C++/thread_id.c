#include <stdio.h>
#include <omp.h>

int main(int argc, char const *argv[])
{
		
	#pragma omp parallel
	{
		int id = omp_get_thread_num();

		printf("I(%d) ", id);
		printf("am(%d) ", id);
		printf("a(%d) ", id);
		printf("Programmer(%d)\n", id);
	}

	return 0;
}