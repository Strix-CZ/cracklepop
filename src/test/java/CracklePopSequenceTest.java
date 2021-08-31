import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CracklePopSequenceTest
{
	private CracklePopSequence cracklePopSequence;

	@BeforeEach
	void setUp()
	{
		cracklePopSequence = new CracklePopSequence();
	}

	@Test
	void sequenceStartsWith1()
	{
		Assertions.assertEquals(cracklePopSequence.get(), "1");
	}

	@Test
	void secondElementIs2()
	{
		cracklePopSequence.get();
		Assertions.assertEquals(cracklePopSequence.get(), "2");
	}

	@Test
	void thirdElementIsCrackle()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(3), "Crackle");
	}

	@Test
	void elementsDivisibleByThreeAreCrackle()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(6), "Crackle");
		Assertions.assertEquals(cracklePopSequence.getElement(912), "Crackle");
	}

	@Test
	void fifthElementIsPop()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(5), "Pop");
	}

	@Test
	void elementsDivisibleByTenArePop()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(10), "Pop");
		Assertions.assertEquals(cracklePopSequence.getElement(1000), "Pop");
	}

	@Test
	void fifteenthElementIsCracklePop()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(15), "CracklePop");
	}

	@Test
	void elementsDivisibleByThreeAndFiveAreCracklePop()
	{
		Assertions.assertEquals(cracklePopSequence.getElement(30), "CracklePop");
		Assertions.assertEquals(cracklePopSequence.getElement(45), "CracklePop");
	}
}