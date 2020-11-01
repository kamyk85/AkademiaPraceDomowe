package course;

public class Cwiczenie2 
{

	public static void main(String[] args) 
	{
		int a [][] = new int [3][3];
		
		a[0][0]=1;
		a[1][0]=0;
		a[2][0]=1;
		a[0][1]=0;
		a[1][1]=1;
		a[2][1]=0;
		a[0][2]=0;
		a[1][2]=1;
		a[2][2]=0;
		
		for (int x = 0; x<3; x++)
		{
			for (int y=0; y<3; y++)
			{
				System.out.print(a[y][x]);
			}
			System.out.println();
		}

	}

}
