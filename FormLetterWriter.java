package chapter4;

public class FormLetterWriter {
	private String lastName;
	

	public FormLetterWriter(String i) {
		lastName=i;
		System.out.println("Dear "+lastName+",\n Thank you for your recent order.");
	}
	private String firstName;
	
	public FormLetterWriter(String i, String ii) {
		lastName=i;
		firstName=ii;
		System.out.println("Dear "+firstName+" "+lastName+",\n Thank you for your recent order.");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] arg) {
		FormLetterWriter form = new FormLetterWriter("Bruh");
		FormLetterWriter form2 = new FormLetterWriter("Moment", "Bruh");
	}
}
