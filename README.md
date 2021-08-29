
Project Setup:

1. open terminal

2. clone the project with this url https://github.com/nishabhagtani/TestProjects.git

3. cd to this project

4. execute command mvn spring-boot:run

5. open browser and go to url http://localhost:8080/getMontyHallWins/10000
   10000 - is number of times to play and it can be changed to any number
   
6. when you hit url http://localhost:8080/getMontyHallWins/10000 then it will show below json structure

	{
	  "changeBoxWins": 73,
	  "originalBoxWins": 27
	}
	
	changeBoxWins - number of times player wins when he changes box
	originalBoxWins - number of times player wins when  he stays with original selected box



