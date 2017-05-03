#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MiClaseDeLogging {

	private final static Log log = LogFactory.getLog(MiClaseDeLogging.class);
 
	private final static String CONSTANTE = "${artifactId}";
	
	public boolean getVersion() {

		boolean retorno = false;
		try {
			log.warn(" *** un warning de ${artifactId}");
			log.error(" *** un error de ${artifactId}");
			retorno = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return retorno;

	}

}
