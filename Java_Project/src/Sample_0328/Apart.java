package Sample_0328;

public class Apart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=8;j++)
			{
				System.out.print(i+"0"+j+" ");
				if(i>5 && j==5)
					break;
			}
			System.out.println("");
		}
	}
}
