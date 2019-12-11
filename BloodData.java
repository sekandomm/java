package chapter4;

public class BloodData {
	String Type1 = "null";
	String RhFactor = "null";
	public String getType1() {return Type1;}
	public void setType1(String i) {Type1=i;}
	public String getRhFactor() {return RhFactor;}
	public void setRhFactor(String ii) {RhFactor=ii;}
	
	public BloodData() {
		this("O", "+");
	}
	
	public BloodData(String i, String ii) {
		Type1=i;
		RhFactor=ii;
	}
}
