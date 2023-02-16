package My_Pack;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Welcome to number guessing Game");
		System.out.println("Number will be between 1 to 100");
		System.out.println("You have 6 chances to guesss number");
		System.out.println("Max score will be 600");
	  
	  for(int j=1;j<=2;j++){
		  int min=1;
			int max=100;
		  int count=6;
			int  randomnum=(int) (Math.random()*(max-min+1)+min);		  
		  System.out.println("\nIt is "+ j + "round out of two ");
	  for(int i=0;i<6;i++){
		  
		 
		  System.out.println("Enter Guess");
		  int choice=sc.nextInt();
		  if(choice==randomnum){
			  System.out.println("Right Number, WOW");
			  System.out.print("Your Score  in "+j +" round is : "+ count*100);
			  break;
		  }else if(choice>randomnum){
			  System.out.println("Guess is to high");
		  }
		  else if(choice<randomnum){
			  System.out.println("Guess is to low");
		  }else
		  {
			  System.out.println("Guess if out of range");
		  }
		  count-=1;
	  }
		  if(count==0)
		  System.out.prinln("Your Score in "+j+"is Zero");
		  
	  }
		
	}
	

}
