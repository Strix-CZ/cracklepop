class CracklePop
{
	private int counter = 1;

	public String get()
	{
		String element = counter == 3 ? "Crackle" : Integer.toString(counter);
		counter++;
		return element;
	}
}