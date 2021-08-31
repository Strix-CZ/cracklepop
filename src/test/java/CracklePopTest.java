import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CracklePopTest
{
	@Test
	void sequenceStartsWith1()
	{
		Assertions.assertEquals(new CracklePop().get(), "1");
	}

	@Test
	void secondNumberIs2()
	{
		var cracklePop = new CracklePop();
		cracklePop.get();
		Assertions.assertEquals(cracklePop.get(), "2");
	}
}