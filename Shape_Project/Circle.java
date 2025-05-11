
package Shape_Project;

public class Circle implements TwoDShape{
	double radius;
	Circle(){
	}
	Circle(double radius){
		if(isValid(radius))
			this.radius=radius;
		else
			System.out.println("Invalid Radius Entered!");
	}
	private boolean isValid(double radius) {
	return radius>0;
	}
	@Override
	public void getDetails() {
		System.out.println("The radius of Circle is: "+radius+" Unit");
	}
	@Override
	public void getArea() {
		System.out.println("The Area of Circle is: "+Math.PI*radius*radius+" Sq. Unit");
	}
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Circle is: "+2*Math.PI*radius+" Unit");
	}
}