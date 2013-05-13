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
	}

	@Test
	public void einzahlen() {

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
