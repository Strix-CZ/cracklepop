import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals(cracklePopSequence.get(), "1");
	}

	@Test
	void secondElementIs2()
	{
		cracklePopSequence.get();
		assertEquals(cracklePopSequence.get(), "2");
	}

	@Test
	void thirdElementIsCrackle()
	{
		assertEquals(cracklePopSequence.getElement(3), "Crackle");
	}

	@Test
	void elementsDivisibleByThreeAreCrackle()
	{
		assertEquals(cracklePopSequence.getElement(6), "Crackle");
		assertEquals(cracklePopSequence.getElement(912), "Crackle");
	}

	@Test
	void fifthElementIsPop()
	{
		assertEquals(cracklePopSequence.getElement(5), "Pop");
	}

	@Test
	void elementsDivisibleByTenArePop()
	{
		assertEquals(cracklePopSequence.getElement(10), "Pop");
		assertEquals(cracklePopSequence.getElement(1000), "Pop");
	}

	@Test
	void fifteenthElementIsCracklePop()
	{
		assertEquals(cracklePopSequence.getElement(15), "CracklePop");
	}

	@Test
	void elementsDivisibleByThreeAndFiveAreCracklePop()
	{
		assertEquals(cracklePopSequence.getElement(30), "CracklePop");
		assertEquals(cracklePopSequence.getElement(45), "CracklePop");
	}
}
