package Vector1;

public class VectorPrct2 
{
	public static void main(String[] args) 
	{
		int space=6;
		int space3=7;
		int star=1;
		int star3=1;
		int space1=7;
		int star2=7;
		int star4=6;
		int space2=0;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<space1;l++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<star3;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
			star3++;
		}
		System.out.println("\n");
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<space2;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<star2;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<space3;l++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<star2;m++)
			{
				System.out.print("*");
			}
			System.out.println();
			space2++;
			star2--;
			star4--;
		}
		
		
		
		
	}

}
