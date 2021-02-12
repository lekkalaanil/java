package pattern;

public class PatternDemo {

	public static void main(String[] args) {
		int n=9;
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n-i;j++)
			{
				if(i>j)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
			
		}
	}

}
