package Shape_Project;

import java.util.Scanner;

public class User {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			g.selectShape();
			System.out.println("Press Y/y to Continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("======Program Ends!!========");
	}

}