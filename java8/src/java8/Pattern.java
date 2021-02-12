package java8;

public class Pattern {

	public static void main(String[] args) {
		
		int i,j,row=10;
		
		for(i=1;i<=row;i++)
		{
			for(j=row-i;j>=0;j--)
			{
				if(i%2==0)
					continue;
				else
					System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
					continue;
				else
					System.out.print("* ");
			}
			if(i%2==0)
				continue;
			System.out.println();
		}

	}

}
