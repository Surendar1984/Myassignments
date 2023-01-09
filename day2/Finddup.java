package week1.day2;

public class Finddup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] numbs = {2, 5, 7, 7, 9, 6, 9, 2, 9};

	for (int i = 0; i < numbs.length; i++) {
		for (int j = i+1; j < numbs.length; j++) {
		if (numbs[i]== numbs[j]) {
		System.out.println(numbs[i]);
		break;
		}
	}
	}
}
}

