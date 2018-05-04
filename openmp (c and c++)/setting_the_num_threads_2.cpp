#include <stdio.h>
#include <omp.h>


int main(int argc, char const *argv[])
{
	
	#pragma omp parallel num thread(3)
	{
		
	}

	return 0;
}