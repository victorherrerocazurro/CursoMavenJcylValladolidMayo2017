package es.jcyl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MiClaseDeLogging {

	private final static Log log = LogFactory.getLog(MiClaseDeLogging.class);
 
	private final static String CONSTANTE = "06_Ejercicio1_Resultado";
	
	public boolean getVersion() {

		boolean retorno = false;
		try {
			log.warn(" *** un warning de 06_Ejercicio1_Resultado");
			log.error(" *** un error de 06_Ejercicio1_Resultado");
			retorno = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return retorno;

	}

}
