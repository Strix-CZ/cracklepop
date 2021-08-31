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
		if (number % 3 == 0)
			return "Crackle";
		else if (number % 5 == 0)
			return "Pop";
		else
			return Integer.toString(number);
	}
}