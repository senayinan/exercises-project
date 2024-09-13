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
