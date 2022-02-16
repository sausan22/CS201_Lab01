package edu.ycp.cs201.dogyears;

import java.util.Scanner;

public class DogYears {
	public static void main(String[] args) {
		// TODO: add your code here
		System.out.println("What is your name?");
		Scanner keyboard = new Scanner(System.in); 
		
		String name = keyboard.next();
		System.out.println("How old are you, " + name);
		
		int a = keyboard.nextInt(); 
		int ans = a*7;
		keyboard.close();
		System.out.println(name + ", in dog years you are " + ans + " years old");
	}
}
