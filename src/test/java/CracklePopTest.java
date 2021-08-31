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

	private String getNthElement(int n)
	{
		for (int i = 0; i < n -1; ++i)
		{
			cracklePop.get();
		}

		return cracklePop.get();
	}
}