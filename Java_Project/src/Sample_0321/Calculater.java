package Sample_0321;

import java.util.*;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10, y=20, result;
		
		result = x + y;
		
		System.out.println(result);
		
		Scanner input = new Scanner(System.in);
		
		int i, j, r;
		
		i = input.nextInt();
		j = input.nextInt();
		
		r = i * j;
		
		System.out.println("multy : "+ r);
		
		input.close();
	
	}

}
