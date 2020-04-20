package com.revature.beans;

public class Human {
	

		
		//control statement --decision making "Switch case"
		static int number;
		public void switchcase(int number) {
			switch(number) {
			case 1 :
				System.out.println("You choosed the first option.");
				break;
			case 2 :
				System.out.println("You choosed the second option.");
				break;
			case 3 :
				System.out.println("You choosed the third option.");
				break;
			case 4 :
				System.out.println("You choosed the fourth option.");
				break;
			default:
				System.out.println("Please input the number between 1-4.");
			
			}
		}
		
		//control statement --Repetition looping "for loop"
		public void forloop(int a) {
			
			for (int i=a; i<10; i++) {
				
				if (i == 5) {
					
					continue;
				}
				
				System.out.println(i);
			}
			
		}
		
		//control statement --Repetition looping "for each loop"
		static int [] Array= {11,22,33,44,55,66,77,88};
		public void foreachloop(int [] a) {
			
			for(int i:a) {
			System.out.println(i);
			}
		}
		
		//control statement --Repetition looping "while loop"
		public void whileloop(int i) {
			
			while (i<10) {
				System.out.println(i);
				i++;

			}
			
		}
		
		
		//control statement --Repetition looping "do while loop"
		public void dowhileloop(int i) {
			
			 do {
				
				System.out.println(i);
				i++;
				if (i==5) {
					
					break;
				}

			}
			 while (i<10);
			
		}
		
}
