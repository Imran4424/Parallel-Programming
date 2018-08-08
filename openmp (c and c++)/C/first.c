#include <stdio.h>
#include <omp.h>

int main()
{

    #pragma omp parallel
    {
        printf("I am a Programmer\n");
    }

    return 0;
}




