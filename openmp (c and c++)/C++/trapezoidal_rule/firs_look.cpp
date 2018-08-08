#include <iostream>
#include <cstdlib>
#include <omp.h>
using namespace std;

int main(int argc, char const *argv[])
{
	double global_result = 0;
	double a,b;
	int n, thread_count;

	thread_count = strtol(argv[1], NULL, 10);

	cout<<"enter the values of a b n"<<endl;

	cin>>a>>b>>n;
	

	return 0;
}