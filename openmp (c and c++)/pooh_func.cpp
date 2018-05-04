#include <studio.h>
#include <omp.h>


int main(int argc, char const *argv[])
{
	double a[1000];

	#pragma omp parallel num_threads(5)
	{
		int ID = omp_get_thread_num();

		
	}

	return 0;
}