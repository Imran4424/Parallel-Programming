Steps to implement

	1. First create an remote interface. 
	2. Then implement the interface in multiple class.
	3. Then implement a multiple server class program for my case for each of the remote method class
	4. Then implement a client class program.
	5. then compile and run



Steps to compile and run

	In first terminal:

		1.	javac *.java
		2.	rmic ImplementingAdder
		3.	rmiregistry


	In second terminal:

			java AdditionServer


	In third terminal:

			java AdditionClient