package Shape_Project;

public class Cylinder implements ThreeDShape{
	double r;
	double h;
	Cylinder(){};
	Cylinder(double r, double h){
		if(isValid(r, h)) {
			this.r=r;
			this.h=h;
		}
		else
			System.out.println("Invalid Details of Cylinder Entered!!");
	}
	private boolean isValid(double r, double h) {
	return r>0 && h>0;
	}
	@Override
	public void getDetails() {
		System.out.println("The radius of Cylinder is: "+r+" Unit");
		System.out.println("The Height of Cylinder is: "+h+" Unit");
	}
	@Override
	public void getVolume() {
		System.out.println("The Area of Cylinder is: "+Math.PI*r*r*h+" Cube. Unit");
	}
	@Override
	public void getLateralSurfaceArea() {
		System.out.println("The LSA of Cylinder is: "+2*Math.PI*r*h+" Sq. Unit");
	}
	@Override
	public void getTotalSurfaceArea() {
		System.out.println("The TSA of Cylinder is: "+2*Math.PI*r*(r+h)+" Sq. Unit");
	}

}