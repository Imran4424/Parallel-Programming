#include <iostream>
using namespace std;

int main(int argc, char const *argv[])
{
	SYSTEM_INFO sysinfo;
	GetSystemInfo(&sysinfo);
	int numCPU = sysinfo.dwNumberOfProcessors;
	
	return 0;
}