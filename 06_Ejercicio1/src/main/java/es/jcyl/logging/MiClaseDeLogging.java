package es.jcyl.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MiClaseDeLogging {

	private final static Log log = LogFactory.getLog(MiClaseDeLogging.class);

	public boolean getVersion() {

		boolean retorno = false;
		try {
			log.warn(" *** un warning de 06_Ejercicio1");
			log.error(" *** un error de 06_Ejercicio1");
			retorno = true;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return retorno;

	}

}
