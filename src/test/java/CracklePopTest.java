import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CracklePopTest
{
	private CracklePop cracklePop;

	@BeforeEach
	void setUp()
	{
		cracklePop = new CracklePop();
	}

	@Test
	void sequenceStartsWith1()
	{
		Assertions.assertEquals(getNthElement(1), "1");
	}

	@Test
	void secondElementIs2()
	{
		Assertions.assertEquals(getNthElement(2), "2");
	}

	@Test
	void thirdElementIsCrackle()
	{
		Assertions.assertEquals(getNthElement(3), "Crackle");
	}

	@Test
	void elementsDivisibleByThreeAreCrackle()
	{
		Assertions.assertEquals(getNthElement(6), "Crackle");
		Assertions.assertEquals(getNthElement(912), "Crackle");
	}

	@Test
	void fifthElementIsPop()
	{
		Assertions.assertEquals(getNthElement(5), "Pop");
	}

	private String getNthElement(int n)
	{
		for (int i = 0; i < n -1; ++i)
		{
			cracklePop.get();
		}

		return cracklePop.get();
	}
}