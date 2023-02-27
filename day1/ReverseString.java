package week2.day1;

public class ReverseString {
public static void main(String[] args) {
	
	String test = "feeling good";
	char[]cha= test.toCharArray();
	for (int i = cha.length-1; i >=0;i--) {
		System.out.print(cha[i]);
		
	}
}
}
