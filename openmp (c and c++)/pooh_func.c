#include <stdio.h>
#include <omp.h>


int main(int argc, char const *argv[])
{
	double a[1000];

	#pragma omp parallel num_threads(5)
	{
		int id = omp_get_thread_num();

		pooh(id,a);
	}

	return 0;
}