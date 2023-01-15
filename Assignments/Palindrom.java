package Assignments;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		 String s1 = s.toLowerCase().replaceAll("[^a-z]", "");
		 //System.out.println("Original : " + s1);
		 StringBuilder rev = new StringBuilder(s1);
		 StringBuilder s2 = rev.reverse();
		 String s3 = s2.toString();
		 //System.out.println("Reversed : "+s3);
	       if(s1.equals(s3)) {System.out.println("True");}
	    	 else {System.out.println("False");}  
	    		
	}

}
