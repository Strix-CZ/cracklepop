import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Created using TDD.
// Tests and exact history after each TDD round is available at
// https://github.com/Strix-CZ/cracklepop
class CracklePopSequence implements Supplier<String>
{
	private int counter = 1;

	public static void main(String[] args)
	{
		System.out.print(Stream.generate(new CracklePopSequence())
				.limit(100)
				.collect(Collectors.joining("\n")));
	}

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
