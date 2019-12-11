package chapter4;

public class Circle {
	private int radius;
	private int diameter;
	private double area;
	
	public int getRadius() {return radius;}
	public void setRaidus(int i) {radius=i;diameter=i*2;area=i*Math.PI;}
	
	public int getDiameter() {return diameter;}
	public double getArea() {return area;}
}
