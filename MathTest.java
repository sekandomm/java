package chapter4;

public class MathTest {

	public static void main(String[] args) {
		System.out.print("The Square root of 37 is: "+Math.sqrt(37)+
				"The sin and cosine of 300 is: "+Math.sin(300)+Math.cos(300)+
				"\nThe value of the floor, ceiling, and round of 22.8 is: "
				+ Math.floor(22.8)+Math.ceil(22.8) +Math.round(22.8)+ 
				"\nThe larger and smaller of the character 'D' and 71 is: Larger:"+Math.max('D', 71)+" Smaller:"+Math.min('D',  71)
				+"\nAnd to end this program, a random number from 0-20: "+(Math.round((Math.random() * ((20 - 0) + 1)) + 0)));
	}

}
