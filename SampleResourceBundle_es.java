package ResourceBundles_IO_Pruebas;
import java.util.*;

public class SampleResourceBundle_es extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];

		resources[0][0] = "Titulo";
		resources[0][1] = "Mi 1º intento";

		resources[1][0] = "TextoParada";
		resources[1][1] = "Para";
		
		resources[2][0] = "TextoInicio";
		resources[2][1] = "Comienza";
		
		return resources;
	}
	
}
