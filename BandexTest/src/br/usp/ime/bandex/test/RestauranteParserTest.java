package br.usp.ime.bandex.test;

import br.usp.ime.bandex.Restaurante;
import br.usp.ime.bandex.RestauranteParser;
import android.test.AndroidTestCase;

public class RestauranteParserTest extends AndroidTestCase {
	Restaurante restaurante;
	RestauranteParser parser;
	
	public void setUp() {
		parser = new RestauranteParser();
	}
	
	public void test_getRestauranteParserTestInvalidXmlFail() {
		restaurante = parser.getRestaurante(100);
		AndroidTestCase.assertTrue(restaurante.getName() == null);
	}
	
	public void test_getRestauranteParserTestValidXmlOk() {
		restaurante = parser.getRestaurante(1);
		AndroidTestCase.assertEquals(restaurante.getName(), "Restaurante Central");
	}

}
