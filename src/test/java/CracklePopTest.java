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
	void secondNumberIs2()
	{
		cracklePop.get();
		Assertions.assertEquals(cracklePop.get(), "2");
	}

	@Test
	void thirdElementIsCrackle()
	{
		cracklePop.get();
		cracklePop.get();
		Assertions.assertEquals(cracklePop.get(), "Crackle");
	}
}