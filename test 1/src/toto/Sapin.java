package toto;

public class Sapin
{

	public static void draw(int line)
	{

		int i = 0, i2 = 1, i3 = 0, nFeuille = 1;

		for (; i < line; i++)
		{
			for (; i2 < line - i; i2++)
				System.out.print(" ");

			for (; i3 < nFeuille; i3++)
				System.out.print("*");

			System.out.print("\n");
			i2 = 1;
			i3 = 0;
			nFeuille += 2;
		}

		i = 0;
		for (; i < 3; i++)
		{
			i2 = 0;
			for (; i2 < line - 1; i2++)
				System.out.print(" ");

			System.out.println("-");
		}
	}
}
