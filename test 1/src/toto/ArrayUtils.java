package toto;

import java.util.Random;

public class ArrayUtils
{

	// Rempli le tableau de valeurs aléatoires comprise entre 0 et 99
	public static void fillTab(int[] tab)
	{
		Random random = new Random();
		for (int i = 0; i < tab.length; i++)
			tab[i] = random.nextInt(99);
	}

	// Afficher le tableau dans la console sur une seule litgne
	public static void printTab(int[] tab)
	{
		for (int i = 0; i < tab.length; i++)
			System.out.print(tab[i] + " ");

		System.out.println("\n");
	}

	// Retourne la valeur maximum du tableau
	public static int getMax(int[] tab)
	{
		int max = 0;
		for (int i = 0; i < tab.length; i++)
			if (max < tab[i])
				max = tab[i];

		return max;
	}

	public static int getMin(int[] tab)
	{
		int min = getMax(tab);
		for (int i = 0; i < tab.length; i++)
			if (min > tab[i])
				min = tab[i];

		return min;
	}

	// Permutte l'emplacement de i et de j dans le tableau
	public static void swap(int[] tab, int i, int j)
	{
		if (i < tab.length && j < tab.length)
		{
			int hold;
			hold = tab[i];
			tab[i] = tab[j];
			tab[j] = hold;
		}
	}

	public static int sumTab(int[] tab)
	{
		int res = 0;
		for (int i = 0; i < tab.length; i++)
			res += tab[i];

		return res;
	}

	public static int averageTab(int[] tab)
	{
		return sumTab(tab) / tab.length;
	}

	public static int averageSuppTab(int[] tab)
	{
		double res = (double) sumTab(tab) / tab.length;
		int ret;
		if (res % 1 > 0)
			ret = (int) ++res;
		else
			ret = (int) res;

		return ret;
	}

	public static int nbMax(int[] tab)
	{
		int max = getMax(tab), count = 0;

		for (int i = 0; i < tab.length; i++)
			if (tab[i] == max)
				count++;

		return count;
	}

	public static int nbMaxV2(int[] tab)
	{
		int max = 0, count = 0;

		for (int i = 0; i < tab.length; i++)
			if (max < tab[i])
			{
				max = tab[i];
				count = 1;
			} else if (max == tab[i])
				count++;

		return count;
	}

	public static boolean isTrier(int[] tab)
	{
		for (int i = 1; i < tab.length; i++)
			if (tab[i - 1] > tab[i])
				return false;

		return true;
	}

	public static int[] addArray(int[] a1, int[] a2)
	{
		int[] a3 = new int[a1.length];

		for (int i = 0; i < a1.length; i++)
			a3[i] = a1[i] + a2[i];

		return a3;
	}

	public static int[] concatTab(int[] tab1, int[] tab2)
	{
		int[] tab3 = new int[tab1.length + tab2.length];
		int i = 0;
		for (int val : tab1)
		{
			tab3[i] = val;
			i++;
		}

		for (int val : tab2)
		{
			tab3[i] = val;
			i++;
		}

		return tab3;
	}

	public static void sortTab(int[] tab)
	{
		int sorting = getMin(tab), n = 0, limit = getMax(tab) + 1;
		int[] tab2 = new int[tab.length];

		for (int i = 0; i < tab2.length; i++)
			tab2[i] = limit;

		while (n < tab.length)
		{
			for (int i = 0; i < tab.length; i++)
				if (tab[i] == sorting)
				{
					tab2[n] = sorting;
					n++;
					tab[i] = limit;
				}
			sorting = getMin(tab);
		}

		for (int i = 0; i < tab.length; i++)
			tab[i] = tab2[i];
	}

	public static void sortTabV2(int[] tab)
	{
		int min, i3 = 0;
		for (int i = 0; i < tab.length - 1; i++)
		{
			int i2 = i;
			min = getMax(tab) + 1;
			for (; i2 < tab.length; i2++)
				if (min > tab[i2])
				{
					min = tab[i2];
					i3 = i2;
				}

			swap(tab, i, i3);
		}
	}

	public static int[] concatAndSort(int[] tab1, int[] tab2)
	{
		int tab3[] = new int[tab1.length + tab2.length];
		int i1 = 0, i2 = 0;
		for (int i = 0; i < tab3.length; i++)
			if (i1 == tab1.length)
			{
				tab3[i] = tab2[i2];
				i2++;
			} else if (i2 == tab2.length)
			{
				tab3[i] = tab1[i1];
				i1++;
			} else if (tab1[i1] > tab2[i2])
			{
				tab3[i] = tab2[i2];
				i2++;
			} else
			{
				tab3[i] = tab1[i1];
				i1++;
			}

		return tab3;
	}

	////////////////////////////////////////////////////////////////////////////
}
