#include <stdio.h>
#include <mpi.h>
#include <string.h>

const int maxString = 100;

int main(int argc, char const *argv[])
{
	char welcome[maxString];
	int total_process;        // total number of process
	int my_rank;             // process rank

	MPI_init(NULL,NULL);
	MPI_Comm_size(MPI_COMM_WORLD, &total_process);
	MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);

	if (my_rank != 0)
	{
		sprintf(welcome,"welcome to the MPI world from process %d of total processes %d", my_rank, total_process);
	}
	else
	{
		printf("Greetings from process %d of %d!\n", my_rank, total_process);

		for (int i = 0; i < total_process; ++i)
		{
			
		}
	}


	return 0;
}
