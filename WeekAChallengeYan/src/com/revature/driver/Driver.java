package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.Human;
import com.revature.beans2.Wrapper;
import com.revature.beans.Instantiate;
	
	public class Driver {
	
	public static void main(String[] args) {
		
		//utilize each type of control statement:
		//Human h = new Human();
		//h.switchcase(1);
		//h.forloop(-12);
		//foreachloop(Array);
		//whileloop(-12);
		//dowhileloop(-12);
		
		//utilize a wrapper class:
		//Wrapper w = new Wrapper(10, 25.56);
		
		//Overload the same method 3 times:
		/*Wrapper.setMyInt(3);
		Wrapper y = new Wrapper(10, 25.56);
		Wrapper.setMyInt(4);
		Wrapper z = new Wrapper(10, 25.56);
		Wrapper.setMyInt(5);
		Wrapper q = new Wrapper(10, 25.56);
		*/

		
		
		//Utilize the Scanner to take in user input to instantiate objects:
		/*int inputInt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a integer number to overload the wrapper class calculation:");
		inputInt = sc.nextInt();
		Wrapper.setMyInt(inputInt);
		System.out.println("The overload calculate result is: ");
		Wrapper s = new Wrapper(10, 25.56);
		*/
		
		
		//Instantiate 2 objects of each type.
		Instantiate name = new Instantiate("Toshi", 2);
		System.out.println(name);


		
		
		
		
	}

}

