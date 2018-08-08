#include <iostream>
#include <stdlib.h>
#include <omp.h>
using namespace std;

double f(double x)
{
	return x*x;
}

void Trap(double a, double b, int n, double* global_result_p)
{
	int thread_count = omp_get_num_threads();
	int my_rank = omp_get_thread_num();

	double h = (b-a) / n;
	
	int local_n = n / thread_count;

	double local_a = a + my_rank*local_n*h;
	double local_b = local_a + local_n*h;

	double my_result = (f(local_a) + f(local_b)) / 2.0;
	double x;

	for (int i = 1; i < local_n; ++i)
	{
		x = local_a + i*h;
		my_result += f(x);
	}

	my_result = my_result*h;

	#pragma omp critical
	{
		*global_result_p += my_result;
	}
}

int main(int argc, char const *argv[])
{
	double global_result = 0;
	double a,b;
	int n;

	if (argc != 2)
	{
      fprintf(stderr, "usage: %s <number of threads>\n", argv[0]);
      exit(0);
   	}

	int thread_count = strtol(argv[1], NULL, 10);

	cout<<"enter the values of a b n"<<endl;

	cin>>a>>b>>n;

	#pragma omp parallel
	{
		Trap(a, b, n, &global_result);
	}

	cout<<"with n = "<<n<<"trapezoids, our estimate"<<endl;
	cout<<"of the integral from "<<a<<" to "<<b<<" = "<<global_result<<endl;

	return 0;
}