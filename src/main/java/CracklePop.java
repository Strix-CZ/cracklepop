class CracklePop
{
	private int counter = 1;

	public String get()
	{
		final String element = getElement(counter);
		counter++;
		return element;
	}

	String getElement(int number)
	{
		boolean divisibleBy3 = number % 3 == 0;
		boolean divisibleBy5 = number % 5 == 0;

		if (divisibleBy3 && divisibleBy5)
			return "CracklePop";
		else if (divisibleBy3)
			return "Crackle";
		else if (divisibleBy5)
			return "Pop";
		else
			return Integer.toString(number);
	}
}