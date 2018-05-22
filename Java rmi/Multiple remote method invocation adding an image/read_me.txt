Steps to implement

	1. First create an remote interface. for my case it's the "ImageProcessor" 
	2. Then implement the interface in a class. for my case that is "ImplementingImageProcessor.java"
	3. Then implement a some employees having the ImplementingImageProcessor as Remote method
	4. Then implement a Manager program who will work out everything.
	5. then compile and run



Steps to compile and run

	In first terminal:

		1.	javac *.java
		2.	rmic ImplementingImageProcessor
		3.	rmiregistry


	In second terminal:

			java 


	In third terminal:

			java AdditionClient