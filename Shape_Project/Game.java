package Shape_Project;
import java.util.Scanner;

public class Game {
	static Scanner sc=new Scanner(System.in);
	Game(){
		System.out.println("=====Game Has Started=====");
	}
	public void selectShape() {
		System.out.println("Press 1===>2D Shape");
		System.out.println("Press 2===>3D Shape");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have Selected 2D Shape");
			TwoDShape td=selectTwoDShape();
			td.getDetails();
			td.getArea();
			td.getPerimeter();
		}
		else if(choice==2) {
			System.out.println("You have Selected 3D Shape");
			ThreeDShape td=selectThreeDShape();
			td.getDetails();
			td.getVolume();
			td.getLateralSurfaceArea();
			td.getTotalSurfaceArea();
		}
		else {
			System.out.println("It is Invalid Choice!!");
			selectShape();
		}
	}
	public TwoDShape selectTwoDShape() {
		
		System.out.println("Press 1===>Circle");
		System.out.println("Press 2===>Triangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the Radius: ");
			double radius=sc.nextDouble();
		return new Circle(radius);
		}
		else if(choice==2) {
			System.out.println("You have Selected Triangle: ");
			System.out.println("Enter side1: ");
			double s1=sc.nextDouble();
			System.out.println("Enter side2: ");
			double s2=sc.nextDouble();
			System.out.println("Enter side3: ");
			double s3=sc.nextDouble();
		return new Triangle(s1,s2,s3);
		}
		else {
			System.out.println("Invalid Choice Entered");
			return selectTwoDShape();
		}
	}
	public ThreeDShape selectThreeDShape() {
		System.out.println("Press 1==> for Cylinder");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the Radius: ");
			double r=sc.nextDouble();
			System.out.println("Enter Height: ");
			double h=sc.nextDouble();
		return new Cylinder(r,h);
		}
		else {
			System.out.println("Invalid Choice Entered!");
		return selectThreeDShape();
		}
		
	}
	

}
