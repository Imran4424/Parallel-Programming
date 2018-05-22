Steps to implement

	1. First create an remote interface. for my case it's the "Calculator.java" 
	2. Then implement the interface in a class. for my case that is "ImplementingCalculator.java"
	3. Then implement a server class program. for my case it is "CalculatorServer.java"
	4. Then implement a client class program. for my case it is "CalculatorClient.java"
	5. then compile and run



Steps to compile and run

	In first terminal:

		1.	javac *.java
		2.	rmic ImplementingCalculator
		3.	rmiregistry


	In second terminal:

			java CalculatorServer


	In third terminal:

			java CalculatorClient