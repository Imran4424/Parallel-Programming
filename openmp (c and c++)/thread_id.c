#include <omp.h>

int main(int argc, char const *argv[])
{
		
	#pragma omp parallel
	{
		id = omp_get_thread_num();

		printf("I(%d) ", id);
		printf("am(%d) ", id);
		printf("a(%d) ", id);
		printf("Programmer(%d) ", id);
	}

	return 0;
}