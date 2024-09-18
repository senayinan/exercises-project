package com.senayinan.exercises_project;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ExercisesProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExercisesProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();

		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();

		System.out.println("Enter your age: ");
		int age = input.nextInt();
		input.nextLine();

		System.out.println("Enter your grade: ");
		String grade = input.nextLine();

		PersonalInfo personalInfo = new PersonalInfo(firstName, lastName, age, grade);

		personalInfo.displayPersonalInfo();


		System.out.println("Enter your score: ");
		int score = input.nextInt();
		GradeCalculator gradeCalculator = new GradeCalculator();
		String gr = gradeCalculator.calculateGrade(score);
		System.out.println("Your grade is: " + gr);


		VowelOrConsonant vowelOrConsonant = new VowelOrConsonant();
		System.out.println("Enter the character to check: ");
		char ch= input.next().charAt(0);
		vowelOrConsonant.characterChecker(ch);


		Calculator calculator = new Calculator();
		System.out.println("Enter the num1 for calculation: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the num2 for calculation: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the operation ( + , - , * , / )  for calculation: ");
		char operation = input.next().charAt(0);
		double result = 0;

		switch(operation)   {
			case '+':
				result = calculator.add(num1,num2);
				break;
			case '-' :
				result = calculator.subtract(num1,num2);
				break;
			case '*' :
				result = calculator.multiply(num1,num2);
				break;
			case '/' :
				result = calculator.divide(num1,num2);
				break;
			default:
				System.out.println("Invalid operation!");

		}
		System.out.println("The result is: " + result);


		System.out.println("Enter the first number to compare: ");
		int n1= input.nextInt();
		System.out.println("Enter the second number to compare: ");
		int n2= input.nextInt();
		System.out.println("Enter the third number to compare: ");
		int n3= input.nextInt();
		CompareNumbers compareNumbers = new CompareNumbers();
		int largest = compareNumbers.findLargest(n1, n2, n3);
		int smallest = compareNumbers.findSmallest(n1, n2, n3);
		boolean equal = compareNumbers.areEqual(n1, n2, n3);
		System.out.println("Largest number: " + largest);
		System.out.println("Smallest number: " + smallest);
		System.out.println("Are all numbers equal? " + (equal ? "Yes" : "No"));


		System.out.println("Enter the number for multiplication?: ");
		int num = input.nextInt();
		System.out.println("Enter the range?: ");
		int range = input.nextInt();
		MultiplicationGenerator multiplicationGenerator = new MultiplicationGenerator();
		multiplicationGenerator.generateMultiplication (num, range);



		System.out.println("Enter the number of Fibonacci terms you want: ");
		int count = input.nextInt();
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.printFibonacci(count);

		System.out.println("Enter the number you want: ");
		int number = input.nextInt();
		input.nextLine();
		NumberChecker numberChecker = new NumberChecker();
		numberChecker.checkNumber(number);

		System.out.println("Pick a color between RED, GREEN or YELLOW: ");
		String color = input.nextLine().toUpperCase();
		TrafficLights trafficLights = new TrafficLights();
		trafficLights.displayColor(color);

		input.close();
	}

	}
