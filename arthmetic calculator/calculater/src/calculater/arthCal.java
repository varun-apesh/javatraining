package calculater;

import java.util.Scanner;

public class arthCal {
	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);
		 System.out.println("enter frist number:");
		 int a= myObj.nextInt();
		 System.out.println("enter second number:");
		 int b= myObj.nextInt();
		 System.out.println("type 1 for addition,2 for subtraction,3 for multiplication,4 for division:");
		 int c= myObj.nextInt();
		 switch(c) {
		 case 1:
			 System.out.println("sum is:"+(a+b));
			 break;
		 case 2:
			 System.out.println("diff is:"+(a-b));
			 break;
		 case 3:
			 System.out.println("product is:"+(a*b));
			 break;
		 case 4:
			 System.out.println("rem is:"+(a/b));
			 break;
		 
		 }
		 
	}

}
