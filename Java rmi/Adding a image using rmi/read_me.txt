Steps to implement

	1. First create an remote interface. for my case it's the "ImageProcessor.java" 
	2. Then implement the interface in a class. for my case that is "ImplementingImageProcessor.java"
	3. Then implement a server class program. for my case it is "ImageServer.java"
	4. Then implement a client class program. for my case it is "ImageClient.java"
	5. then compile and run



Steps to compile and run

	In first terminal:

		1.	javac *.java
		2.	rmic ImplementingImageProcessor
		3.	rmiregistry


	In second terminal:

			java ImageServer


	In third terminal:

			java ImageClient