package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 11;
		int sum1 = 0;
		int sum2 = 1;
        System.out.print("Fibonacci Series of "+a+" numbers:");						
		for (int i = 0; i <=a; i++) {
        System.out.print(sum1+" ");			
        int sum = sum1 + sum2;
        sum1 = sum2;
        sum2 = sum;
		} 
	}

}
