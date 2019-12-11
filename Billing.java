package chapter4;

public class Billing {
	private double bill;
	public Billing(double i) {
		bill=i+(i*0.08);
	}
	
	private double bill2;
	public Billing(double i, double ii) {
		bill2=(i*ii)+(i*ii)*0.08;
	}
	
	private double bill3;
	public Billing(double i, double ii, double iii) {
		bill3=((i*ii)+iii)-((i*ii)+iii*0.08);
	}
	
	public static void main(String[] arg) {
		Billing form = new Billing(100);
		Billing form2 = new Billing(100,3);
		Billing form3 = new Billing(100,3,60);
		System.out.println(form.bill);
		System.out.println(form2.bill2);
		System.out.println(form3.bill3);
		
	}
}
