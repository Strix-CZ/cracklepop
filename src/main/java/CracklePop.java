class CracklePop
{
	private int counter = 1;

	public String get()
	{
		final String element;
		if (counter % 3 == 0)
			element = "Crackle";
		else if (counter % 5 == 0)
			element = "Pop";
		else
			element = Integer.toString(counter);

		counter++;

		return element;
	}
}