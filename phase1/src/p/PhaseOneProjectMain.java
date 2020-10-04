package p;

import java.util.Scanner;

public class PhaseOneProjectMain {

	public static void main(String[] args) {
		int ch1=0,ch2=0;
		System.out.println("WELCOME to Phase 1 project. ");
		System.out.println("Developed by- Sugam Kumar Shukla \n");

		Scanner sc=new Scanner(System.in);
		BusinessLogic obj= new BusinessLogic();
		do {
		System.out.println("Choose an option to perform");
		System.out.println("1.Retrieve the file names in an ascending order\n2.Business-level operations:\n3.Close the application\n");
		System.out.println("Enter your choice:");
		
		try {
				ch1=Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
		}
		switch(ch1) {
			case 1: obj.sort();
					break;
			case 2:do {
					System.out.println("Choose an option to perform.\n1. Add a file.\n2. Delete a file.\n3. Search a file.\n4. Back to Main menu.\n");
					try {
							ch2=Integer.parseInt(sc.nextLine());
						}catch(NumberFormatException e) {
							System.out.println("Enter valid option !");
						}
				
					switch(ch2) {
						case 1: obj.add();
							break;
						case 2:obj.delete();
							break;
						case 3:obj.search();
							break;
						case 4:break;
						default:System.out.println("Enter valid choice !");
						break;
					}
				}while(ch2!=4);
			break;
			case 3:System.out.println("Thank you for using the application !");
				break;
			default:System.out.println("Enter valid option !");
			break;
		}
		}while(ch1!=3);
	}

}
