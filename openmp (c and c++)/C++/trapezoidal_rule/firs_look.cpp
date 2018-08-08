#include <iostream>
#include <cstdlib>
#include <omp.h>
using namespace std;

void Trap(double a, double b, int n, double* global_result)
{
	double h,x,my_result;
	double local_a,local_b;

	int thread_count = omp_get_num_threads();
	int my_rank = omp_get_thread_num();

	double h = (b-a) / n;
	
	int local_n = n / thread_count;

	double local_a = a + my_rank*local_n*h;
	double local_b = local_a + local_n*h;

	
}

int main(int argc, char const *argv[])
{
	double global_result = 0;
	double a,b;
	int n;

	int thread_count = strtol(argv[1], NULL, 10);

	cout<<"enter the values of a b n"<<endl;

	cin>>a>>b>>n;


	return 0;
}