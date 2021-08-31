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
		Assertions.assertEquals(cracklePop.get(), "1");
	}

	@Test
	void secondElementIs2()
	{
		cracklePop.get();
		Assertions.assertEquals(cracklePop.get(), "2");
	}

	@Test
	void thirdElementIsCrackle()
	{
		Assertions.assertEquals(cracklePop.getElement(3), "Crackle");
	}

	@Test
	void elementsDivisibleByThreeAreCrackle()
	{
		Assertions.assertEquals(cracklePop.getElement(6), "Crackle");
		Assertions.assertEquals(cracklePop.getElement(912), "Crackle");
	}

	@Test
	void fifthElementIsPop()
	{
		Assertions.assertEquals(cracklePop.getElement(5), "Pop");
	}
}