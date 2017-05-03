#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.junit.Assert.*;

import org.junit.Test;

public class MiClaseDeLoggingUT {

	@Test
	public void test() {
		MiClaseDeLogging sut = new MiClaseDeLogging();
		
		boolean resultadoObtenido = sut.getVersion();
		
		assertTrue(resultadoObtenido);

		//fail("Not yet implemented");
	}

}
