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
		// erst 200 aufs konto einzahlen um sicher zu gehen, dann 100 wieder
		// abnehmen und schauen ob wir eine Differenz von 100 haben zum
		// vorherigen wert
		int alter_stand = konto.getGuthaben();
		konto.einzahlen(200);
		konto.auszahlen(100);
		assertTrue(konto.getGuthaben() - 100 == alter_stand);

	}

	@Test(expected = RuntimeException.class)
	public void abheben_ungenügent() {
		// konto stand erfassen und +200 abnehmen
		konto.auszahlen(konto.getGuthaben() + 200);
	}

	@Test
	public void mehrfach_einzahlen_komplett_abheben() {
		for (int i = 0; i < 10; i++) {
			konto.einzahlen(i*20);
		}
		konto.auszahlen(konto.getGuthaben());
		assertTrue(konto.getGuthaben() == 0);
	}

}
