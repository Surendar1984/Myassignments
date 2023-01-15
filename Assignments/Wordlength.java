package Assignments;

public class Wordlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello World";
		String[] i = a.split(" ");
		//System.out.println(word1[0]);
		//String j = i[i.length-1];
		System.out.println("Example 1: "+"The last word " +" is "+ i[1]);
		

	String b = "   fly me   to   the moon  ";
	String[] k = b.split(" ");
	//System.out.println(word1[0]);
	String l = k[k.length-1];
	System.out.println("Example 2: "+"Length of the last word " +"("+ l +") is "+ l.length());
		
	
	String c = "luffy is still joyboy";
	String[] m = c.split(" ");
	//System.out.println(word1[0]);
	String n = m[m.length-1];
	System.out.println("Example 2: "+"Length of the last word " +"("+ n +") is "+ n.length());
	
	}   
	
	

}
