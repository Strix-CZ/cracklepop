import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CracklePopTest
{
	@Test
	void sequenceStartsWith1()
	{
		Assertions.assertEquals(new CracklePop().get(), "1");
	}
}