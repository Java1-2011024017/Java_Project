package Sample_0328;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i=0; i<10; i++)
			System.out.println(ar[i]);
		
		int[] ar2 = new int[10];
		for(int i=0; i<10; i++)
		{
			ar2[i] = i+1;
			System.out.println(ar2[i]);
		}
		
		for(int i: ar2)
			System.out.println("for-each : " +i);

	}
}
