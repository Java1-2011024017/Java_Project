package Sample_0328;

public class For_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		int j=10;
		while(j>=1)

		{
			System.out.println(j*10);
			j--;
		}
		
		for(int i=1; i<=2; i++)
		{
			for(int k=1; k<=3; k++)
			{
				System.out.println(i+" "+k);
			}
		}
	}

}
