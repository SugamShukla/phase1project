package p;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		int res=0;
		System.out.println("Arithmetic Calculator");
		System.out.println("Select a choice\n1. Add\n2. Subtract\n3. 1Multiply\n4. Divide\n");
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
		System.out.println("Enter value of a:");
		int a=sc.nextInt();
		System.out.println("Enter value of b:");
		int b=sc.nextInt();
		switch(ch) {
		case 1: res=a+b;
		System.out.println("Sum:"+res);
		break;
		case 2: res=a-b;
		System.out.println("Difference:"+res);
		break;
		case 3: res=a*b;
		System.out.println("Product:"+res);
		break;
		case 4: if(b==0) {
			System.out.println("Value of b cannot be zero !!");
		}
		else {
			res=a/b;
		System.out.println("Quotient:"+res);}
		break;
		default:break;
		}


	}

}
