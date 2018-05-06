#include <iostream>
#include <mpi.h>
using namespace std;

int main(int argc, char *argv[]) { 
MPI::Init(argc, argv);

     int num_procs = MPI::COMM_WORLD.Get_size();
     int rank = MPI::COMM_WORLD.Get_rank();
     cout << "Hello world from processes " << rank
                << " of " << num_procs << "\n";
MPI::Finalize();

return 0;
}