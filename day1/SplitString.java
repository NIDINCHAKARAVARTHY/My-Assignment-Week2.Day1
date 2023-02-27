package week2.day1;

public class SplitString {
	public static void main(String[] args) {
		String str = "Amazon have 1200 woodenproduct out of 100000";
		String replaceAll= str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
	}

}
