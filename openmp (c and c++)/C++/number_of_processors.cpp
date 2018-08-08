#include <iostream>
#include <windows.h>
using namespace std;

int main(int argc, char const *argv[])
{
	SYSTEM_INFO sysinfo;
	GetSystemInfo(&sysinfo);
	int numCPU = sysinfo.dwNumberOfProcessors;

	printf("you are using %d processors\n", numCPU);

	return 0;
}