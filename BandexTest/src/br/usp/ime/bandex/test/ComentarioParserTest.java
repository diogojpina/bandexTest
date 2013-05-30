package br.usp.ime.bandex.test;

import java.util.List;
import br.usp.ime.bandex.Comentario;
import br.usp.ime.bandex.ComentarioParser;
import android.test.AndroidTestCase;

public class ComentarioParserTest extends AndroidTestCase {
	List<Comentario> comentarios;
	ComentarioParser parser;
	
	public void setUp() {
		parser = new ComentarioParser();
	}
	
	public void test_getComentarioParserTestInvalidXmlFail() {
		comentarios = parser.getComentarios(1000);
		AndroidTestCase.assertTrue(comentarios.size() == 0);		
	}
	
	public void test_getComentarioParserTestValidXmlOk() {
		comentarios = parser.getComentarios(1);
		AndroidTestCase.assertTrue(comentarios.size() > 0);
	}	
}
