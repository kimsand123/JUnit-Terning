package terning;
import terning.Dice;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTerning {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() {
		Dice terning;
		int ettere, toere, treere, firere, femmere, seksere;
		ettere = 0;
		toere = 0;
		treere = 0;
		firere = 0;
		femmere = 0;
		seksere = 0;
		
		terning = new Dice();
		for (int x=1;x<=60000;x++) {

			switch (terning.roll()) {
			case 1:
				ettere = ettere + 1;			
				break;
			case 2:
				toere = toere + 1;
				break;
			case 3:
				treere = treere + 1;
				break;
			case 4:
				firere = firere + 1;
				break;
			case 5:
				femmere = femmere + 1;
				break;
			case 6:
				seksere = seksere + 1;
				break;
			}
		}
		System.out.println("ettere = "+ ettere);
		System.out.println("toere = "+ toere);
		System.out.println("treere = "+ treere);
		System.out.println("firere = "+ firere);
		System.out.println("femmere = "+ femmere);
		System.out.println("seksere = "+ seksere);
		
	}
}