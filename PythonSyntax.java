import java.util.Random;import java.util.Scanner;public class PythonSyntax{public void print(String i){System.out.println(i);}
public void print(double i){System.out.println(i);}
public void print(int i){System.out.println(i);}
public void print(Random i){System.out.println(i);}
public String input(String i){@SuppressWarnings("resource")
Scanner st=new Scanner(System.in);System.out.println(i);String v=st.nextLine();return v;}
public int input(String ii,int v){@SuppressWarnings("resource")
Scanner it=new Scanner(System.in);System.out.println(ii);v=it.nextInt();return v;}
public double input(double i){@SuppressWarnings("resource")
Scanner db=new Scanner(System.in);System.out.println(i);double v=db.nextDouble();return v;}}