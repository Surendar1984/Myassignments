package Assignments;

public class Squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				int n =  8;
				
				if(n <= 2) {
					System.out.println("Square Root of " + n + " is: " + n);
					return;
				}
				
				int i = 1;
				
				while(i*i  <= n) {
					i++;
				}
				
				System.out.println("Square Root of " + n + " is: " + (i-1));
				
				
			}
}
