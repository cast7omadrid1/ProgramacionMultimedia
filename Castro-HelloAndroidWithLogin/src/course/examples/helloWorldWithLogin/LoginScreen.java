package course.examples.helloWorldWithLogin;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends Activity {
	@Override
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loginscreen);
		
		//guardara en los objetos EditText y button todo lo que contenga username-edittext o login_button
		final EditText uname = (EditText) findViewById(R.id.username_edittext);
		final EditText passwd = (EditText) findViewById(R.id.password_edittext);
		final Button loginButton = (Button) findViewById(R.id.login_button);
		
		//es un escuchardor que cuando pulsas sobre el boton de login va a llamar al onClick
		//Los valores del boton los obtenems en la parte superior
		loginButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				//hace referencia al metodo boolean de abajo, si los valores que devuelve son los mismos
				//te manada al intent 
				/*Es decir si el nombre y la contraseña que introduzcamos
				son iguales que las generadas al azar en el metodo checkPassword 
				nos vanda al intent que hará referencia a la primera actividad
				llamada HelloAndroid y la ejecutara gracias al startActivity
				 */
				if (checkPassword(uname.getText(), passwd.getText())) {
					
					
					//crea un intent explicito para comenzar el HelloAndroid.xml
					Intent helloAndroidIntent = new Intent(LoginScreen.this,
							HelloAndroid.class);
					
					//comenzamos la actividad
					
					startActivity(helloAndroidIntent);

					//si no dejamos los edit text vacios
				} else {
					uname.setText("");
					passwd.setText("");
				}
			}
		});
	}

	
	//devolvera un nombre y una contraseña al azar de tal modoqu
	private boolean checkPassword(Editable uname, Editable passwd)
	{
		//devuelve un 0 o un 1
		// Just pretending to extract text and check password
		return new Random().nextBoolean();
	}
}
