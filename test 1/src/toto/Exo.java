package toto;

public class Exo
{
	public static int multiplyAndAdd(int a, int b, int c)
	{
		return a * (b + c);
	}

	public static boolean checkDate(int jour, int mois, int annee)
	{
		return checkJour(jour, mois, annee) && checkMonth(mois) && checkYear(annee);
	}

	public static boolean checkJour(int jour, int mois, int annee)
	{
		if ((mois >= 1 && mois <= 7 && mois % 2 != 0 && mois != 2) || (mois >= 8 && mois <= 12 && mois % 2 == 0))
			return jour >= 1 && jour <= 31;
		else if (mois == 2)
		{
			if (isBix(annee))
				return jour >= 1 && jour <= 29;
			else
				return jour >= 1 && jour < 29;
		} else
			return jour >= 1 && jour < 31;
	}

	public static boolean isBix(int annee)
	{
		if (annee % 4 == 0 && annee % 100 != 0)
			return true;
		else if (annee % 400 == 0)
			return true;
		else
			return false;
	}

	public static boolean checkMonth(int mois)
	{
		return mois >= 1 && mois <= 12;
	}

	public static boolean checkYear(int annee)
	{
		return annee > 0;
	}

	public static int max(int a, int b, int c)
	{
		return (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
	}

	public static void boucle1()
	{
		for (int i = 1; i <= 10_000; ++i)
			if (i % 47 == 0)
				System.out.println(i);
	}

	public static int boucle2()
	{
		int i = 1, old = 0;
		while (!((i % 7 == 0) && (i % 11 == 0) && (i % 5 == 0) && ((i + old) % 36 == 1)))
		{
			old = i;
			i++;
		}

		return i;
	}

	public static void addEvenNumbers()
	{
		int res = 0;
		for (int i = 0; i <= 100; i++)
			if (i % 2 == 0)
				res += i;
		System.out.println(res);
	}

	public static void addDivNumbers(int min, int max, int... cs)
	{
		int res = 0;
		boolean checked;
		for (int i = min; i <= max; i++)
		{
			checked = true;
			for (int i2 = 0; i2 < cs.length; i2++)
				if (i % cs[i2] != 0)
				{
					checked = false;
					break;
				}
			if (checked == true)
				res++;
		}
		System.out.println(res);
	}

	public static void display(char... cs)
	{
		System.out.println(cs);
	}

	public static int charCount(String str)
	{
		int res = 0;
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
				res++;

		return res;
	}

	public static int countVowel(String str)
	{
		int res = 0;
		for (int i = 0; i < str.length(); i++)
			if (isVowel(str.charAt(i)))
				res++;

		return res;
	}

	static boolean isVowel(char c)
	{
		return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
				|| c == 'U' || c == 'y' || c == 'Y');
	}

	public static int countCap(String str)
	{
		int res = 0;
		for (int i = 0; i < str.length(); i++)
			if (isCap(str.charAt(i)))
				res++;

		return res;
	}

	static boolean isCap(char c)
	{
		return (c >= 65 && c <= 90);
	}

	public static void deleteCap(String str)
	{
		String newStr = "";
		for (int i = 0; i < str.length(); i++)
			if (!isCap(str.charAt(i)))
				newStr += str.charAt(i);
		System.out.println(newStr);
	}

	public static String reverseString(String str)
	{
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--)
			newStr += str.charAt(i);

		return newStr;

	}

	public static String toCap(String str)
	{
		String newStr = "";
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (isMin(c))
				newStr += (char) (str.charAt(i) - 32);
			else
				newStr += str.charAt(i);
		}

		return newStr;
	}

	static boolean isMin(char c)
	{
		return (c >= 'a' && c <= 'z');
	}

	public static char averageLetter(String str)
	{
		if (str.length() == 0)
			return '0';
		str = toCap(str);
		int average = 0;
		for (int i = 0; i < str.length(); i++)
			average += str.charAt(i);
		average /= str.length();

		return (char) average;
	}

	public static char biggerChar(String str)
	{
		int res = 0;
		str = toCap(str);

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) > res)
				res = str.charAt(i);

		return (char) res;
	}

	public static char smallerChar(String str)
	{
		int res = 'Z' + 1;
		str = toCap(str);

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) < res)
				res = str.charAt(i);

		return (char) res;
	}

	public static String trim(String str)
	{
		String res = "";
		int i = 0, max;
		for (; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				break;

		for (max = str.length() - 1; max >= 0; max--)
			if (str.charAt(max) != ' ')
				break;

		for (; i <= max; i++)
			res += str.charAt(i);

		return res;
	}

	public static String trimV2(String str)
	{
		String res = "";
		int i = 0, max = str.length() - 1;

		while (str.charAt(i) == ' ')
			i++;

		while (str.charAt(max) == ' ')
			max--;

		for (; i <= max; i++)
			res += str.charAt(i);

		return res;
	}

	public static String trimMiddleSpaces(String str)
	{
		String res = "";
		int i = 0, max;
		for (; i < str.length(); i++)
		{
			res += str.charAt(i);
			if (str.charAt(i) != ' ')
				break;
		}

		for (max = str.length() - 1; max >= 0; max--)
			if (str.charAt(max) != ' ')
				break;

		for (; i <= max; i++)
			if (str.charAt(i) != ' ')
				res += str.charAt(i);

		for (; i < str.length(); i++)
			res += str.charAt(i);

		return res;
	}

	public static String trimMiddleSpacesV2(String str)
	{
		int i = 0, max = str.length() - 1;
		String res = "";

		while (str.charAt(i) == ' ')
		{
			res += str.charAt(i);
			i++;
		}

		while (str.charAt(max) == ' ')
			max--;

		for (; i < str.length(); i++)
			if ((i <= max && str.charAt(i) != ' ') || i > max)
				res += str.charAt(i);

		return res;
	}

	public static String removeO(String str)
	{
		String res = "";

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) != 'o' && str.charAt(i) != 'O')
				res += str.charAt(i);

		return res;
	}

	public static boolean palindrome(String str)
	{
		str = str.toLowerCase();
		for (int is = 0, ie = str.length() - 1; is < ie; is++, ie--)
			if (str.charAt(is) != str.charAt(ie))
				return false;

		return true;
	}

	public static boolean palindromeV2(String str)
	{
		String inverse = "";
		inverse = reverseString(str);

		if (equal(str, inverse))
			return true;
		else
			return false;
	}

	public static boolean equal(String s1, String s2)
	{
		if (s1.length() != s2.length())
			return false;

		for (int i = 0; i < s1.length(); i++)
			if (s1.charAt(i) != s2.charAt(i))
				return false;

		return true;
	}

}
