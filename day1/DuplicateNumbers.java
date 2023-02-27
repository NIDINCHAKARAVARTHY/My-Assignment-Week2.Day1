package week2.day1;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int dup[]= {2,5,3,1,4,5,7,6,3,2};
		for (int i = 0; i < dup.length-1; i++) {
			for (int j =i+1; j < dup.length; j++) {
				if (dup[i]==dup[j]) {
					System.out.println(dup[i]);
				}
				
			}
			
		}
		
	}
}
