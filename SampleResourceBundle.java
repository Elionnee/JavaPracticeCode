package ResourceBundles_IO_Pruebas;
import java.util.*;

public class SampleResourceBundle extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];

		resources[0][0] = "Title";
		resources[0][1] = "My 1st try";

		resources[1][0] = "StopText";
		resources[1][1] = "Stop";
		
		resources[2][0] = "StartText";
		resources[2][1] = "Start";
		
		return resources;
	}
	
}
