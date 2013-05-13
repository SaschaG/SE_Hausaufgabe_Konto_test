import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Konto_Test {

	Konto konto;

	@Before
	public void initialize() {
		// Als erstes ein Konto erstellen
		konto = new Konto(2000);
	}

	@Test
	public void Startguthaben() {
		assertNotNull(konto);
	}

	@Test
	public void einzahlen() {
		int alter_stand = konto.getGuthaben();
		konto.einzahlen(200);
		assertTrue(alter_stand + 200 == konto.getGuthaben());
	}

	@Test
	public void abheben_ausreichend() {

	}

	@Test(expected = RuntimeException.class)
	public void abheben_ungenügent() {

	}

	@Test
	public void mehrfach_einzahlen_komplett_abheben() {

	}

}
