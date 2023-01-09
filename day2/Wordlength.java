package week1.day2;

public class Wordlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String[] word1 = s1.split(" ");
		String lastword1 = word1[word1.length-1];
		System.out.println("Example 1: "+"Lenth of the last word " +"("+ lastword1 +") is "+ lastword1.length());
		 
		String s2 = "   fly me   to   the moon  ";
		String ns2 = s2.trim();
		String[] word2 = s2.split(" ");
		String lastword2 = word2[word2.length-1];	
		System.out.println("Example 2: "+"Lenth of the last word " +"("+ lastword2 +") is "+ lastword2.length());
		
		String s3 = "luffy is still joyboy";
		String[] word3 = s3.split(" ");
		String lastword3 = word3[word3.length-1];
		System.out.println("Example 3: "+"Lenth of the last word " +"("+ lastword3 +") is "+ lastword3.length());
	}

}
