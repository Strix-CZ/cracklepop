class CracklePop
{
	private int counter = 1;

	public String get()
	{
		String element = Integer.toString(counter);
		counter++;
		return element;
	}
}