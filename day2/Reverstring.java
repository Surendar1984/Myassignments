package week1.day2;

public class Reverstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Reverse";
		
		char [] charArray = name.toCharArray();
			for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i] + ",");		
			
		} 
		
	}

}
