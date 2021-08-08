# Lab 4
  Topics 
  - Writing, compiling and executing a simple Java program
  - Giving input to the program in Java
  - Use of control statements in Java
  - Use of iteration statement in Java

Q1). Program to print your name, roll no, section and branch in separate lines. <br/>
Q2). Program to print the corresponding grade for the given mark using if..else statement in Java. <br/>
Q3). Program to print the corresponding week day for the given day no. of the current month using switch..case statement in Java <br/>
Q4). Program to check a user entered number is palindrome or not. <br/>
Q5). Write a program in Java to take first name and last name from user and print both in one line as last name followed by first name. <br/>

# Lab 5 
 Topics
 - Array in Java
 - Command line arguments in Java
 - static and final modifier in Java

Q1). Find the largest among 3 user entered nos. at the command prompt using Java <br/>
Q2). Accept 10 numbers from command line and check how many of them are even and how many odd. <br/>
Q3). Program to sort the user entered list of numbers of any size. <br/>
Q4). Program to find no. of objects created out of a class using 'static' modifier. <br/>
Q5). Find the no. of occurrence of each element in an user entered list of nos. <br/>
Q6). Find sum of each diagonal (left & right) elements separately of a user entered 3 X 3 matrixes in Java. <br/>

# Lab 6
 Topics 
 - class and objects in Java
 - method overloading in Java
 - constructor overloading in Java

Q1). Write a class file – box with three data members(length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed. <br/>
Q2). Write a program to overload subtract method with various parameters in a class in Java <br/>
Q3). Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions. <br/>
Q4). Write a program in Java to define a class Rectangle having data member: length and breadth; to calculate the area and perimeter of the rectangle. Use member functions to read, calculate and display. <br/>
Q5). Write a program in java to input and display the details of n number of students having roll, name and cgpa as data members. Also display the name of the student having lowest cgpa. <br/>
Q6). Write a program to calculate area according to user input, whether it is circle, square or triangle (Menu Driven). <br/>
Q7). Write a program in Java to define a class Number with appropriate data members and member functions to input n number of integers and swap the biggest and smallest elements. Use member functions read(), swap() and display(). <br/>

# Lab 7
 Topics 
 - Single level inheritance in Java
 - Multi-level inheritance in Java
 - Method Overriding
 - Dynamic Method Dispatch

Q1).A plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D. <br/>
Q2). Illustrate the execution of constructors in multi-level inheritance with three Java classes – plate(length, width), box(length, width, height), wood box(length, width, height, thick) <br/>
Q3). Program on Dynamic Method Dispatch. <br/>
Q4). Write a program in java to define a class Shape which has data member „area‟ and a member function showArea(). Derive two classes Circle and Rectangle from Shape class. Add appropriate data members and member functions to calculate and display the area of Circle and Rectangle. <br/>
Q5). Write a program to create an Account class containing acc_no, balance as data members and disp() to display the details. Inherit it in Person class with all mentioned data members and functions. Person class also has name and aadhar_no as extra data members of its own. Override disp() function. Create 5 persons‟ details. <br/>
Q6). Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super. <br/>

# Lab 8
  Topics 
  - Abstract classes in Java
  - Interface in Java

Q1). Illustrate the usage of abstract class with following Java classes - <br/>
     i). An abstract class „student‟ with data member roll no, reg no and a abstract method course() <br/>
     ii). A subclass „kiitian‟ with course() method implementation <br/>
Q2). Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class "Washing machine" which implements this interface and write the code to check the value of the interface data member thru an object of the class. <br/>
Q3). Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class „Manager‟ which uses this interface without implementing bonus() method. Also define another Java class „Substaff‟ which extends from „Manager‟ class and implements bonus() method. Write the complete program to find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by the user as per the following guidelines – <br/>
earnings = basic + DA (80% of basic) + HRA (15% of basic) <br/>
deduction PF = 12% of basic <br/>
bonus = 50% of basic <br/>

# Lab 9
 Topics 
 - Package in Java 
 - String handling in Java

Q1). Define two packages as – General and Marketing. In General package define a class „employee‟ with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as <br/> earnings = basic + DA (80% of basic) + HRA (15% of basic) <br/>
In Marketing package define a class „sales‟ which is extending from „employee‟ class and has a method tallowance() which calculates Travelling Allowance as 5% of total earning. Write the programs to find out total earning of a sales person for the given basic salary amount and print along with the emp id. <br/>
Q2).  Write a program to perform following operations on user entered strings – <br/>
      i) Change the case of the string <br/>
      ii) Reverse the string <br/>
      iii) Compare two strings <br/>
      iv) Insert one string into another string <br/>
Q3). Program on Dynamic Method Dispatch. <br/>

# Lab 10
 Topics 
 - Exception handling in Java 
 - ArithmaticException, ArrayIndexOutofBoundsException, 
 - NullPointerException
 - User defined exception in Java

Q1). Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement. <br/>
Q2). A subclass exception must appear before super-class exception. Justify this with suitable Java programs. <br/>
Q3). Write a Java program to illustrate try..catch..finally block. <br/>
Q4). Write a Java class which has a method called ProcessInput(). This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called NegativeNumberException, otherwise it displays the double value of the entered number. <br/>
Q5). Write a program to create user defined exceptions called HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and throw the user defined exceptions if hours (>24 & <0),minutes(>60 & <0),seconds(>60 & <0). <br/>
Q6). Create an user defined exception named Check Argument to check the number of arguments passed through command line. If the number of 
arguments is less than four, throw the Check Argument exception, else print the addition of squares of all the four elements. <br/>
Q7). Write a java program to create Account with 500 rupee minimum balance, deposit amount, withdraw amount and also throws LessBalanceException which returns the statement that says withdraw amount is not valid. <br/>
Q8).  Write a java program to implement a stack class having methods push () and pop(). These methods must be designed to throw user defined exception when the stack is empty or full. <br/>
Q9). Write a java program to justify “A subclass exception must appear before super-class exception”. <br/>

