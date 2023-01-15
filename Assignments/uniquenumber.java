package Assignments;

public class uniquenumber {

	public static void main(String[] args) {
		int [] num = {1,4,4,2,5,3,2,3};
		
		for (int i= 0; i<num.length; i++)
		{
		
			boolean unique = false;
		
		for (int j = 0; j<num.length; j++)
		{
				if ((num[i] == num[j]) && (i != j))
				{
					unique = true;
					break;
				}
		}		
				if (!unique) {
				System.out.println(num[i]+" ");
				}

		}
}
}
