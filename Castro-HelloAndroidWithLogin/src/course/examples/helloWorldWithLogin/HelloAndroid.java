package course.examples.helloWorldWithLogin;

import android.app.Activity;
import android.os.Bundle;
//generamos la interfaz de la actividad
public class HelloAndroid extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {

		// Required call through to Activity.onCreate()
		// Restore any saved instance state
		
		//restaura cualquier estado de la instancia que haya sido guardado
		
		super.onCreate(savedInstanceState);

		/*indicamos a android que establezca como interfaz gráfica de esta
		actividad la definida en el recurso R.layout.helloandroid*/
		setContentView(R.layout.helloandroid);
}