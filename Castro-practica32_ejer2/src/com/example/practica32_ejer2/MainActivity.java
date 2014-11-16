package com.example.practica32_ejer2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/* Dentro de la actividad principal definimos un OnClickListener
 * ya que resulta más conveniente ejecutarlo como parte de la actividad.
 * Esto se ejecutará cuando el usuario haga clic sobre alguno de los botones 
 * o elementos asociados dentro del OnClickListener */
public class MainActivity extends Activity implements OnClickListener {

	// definimo las variables que usaremos para la realización de las
	// suma, resta, multiplicación y división
	int suma = 0;
	int resta = 0;
	int mult = 0;
	int div = 0;

	// definimos las variables para almacenar los dos números que
	// van a interveniren la operación
	int num1, num2;
	// Definimos la variable donde almacenaremos el resultado de las operaciones
	int resultado;

	// definimos las variables para los distintos botones que serán de tipo
	// Button
	// Estos hacen referencia a los distintos botones creados
	Button btn0;
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btnMas;
	Button btnMenos;
	Button btnIgual;
	Button btnBorrar;
	Button btnPor;
	Button btnDiv;

	// dentro del metodo onCreate que ejecutará la primera actividad de la
	// aplicación
	// creamos las diferentes operaciones que se van a realizar
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calculadora);

		// las variables creadas anteriormene de tipo Button guardaran lo que
		// contiene
		// los botones a los que son asociadas dichas variables

		btn0 = (Button) findViewById(R.id.btn0);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		btn6 = (Button) findViewById(R.id.btn6);
		btn7 = (Button) findViewById(R.id.btn7);
		btn8 = (Button) findViewById(R.id.btn8);
		btn9 = (Button) findViewById(R.id.btn9);
		btnMas = (Button) findViewById(R.id.btnMas);
		btnIgual = (Button) findViewById(R.id.btnIgual);
		btnBorrar = (Button) findViewById(R.id.btnC);
		btnMenos = (Button) findViewById(R.id.btnMenos);
		btnPor = (Button) findViewById(R.id.btnPor);
		btnDiv = (Button) findViewById(R.id.btnDiv);

		//asociamos cada boton con el OnClickListener
		//de tal forma que esto nos permite asociar la accion de clicar sobre los botones
		//con la accion que deben realizar estos botones
		//Es decir implementaremos las acciones a realizar cuando pulsemos
		//el boton en la pantalla
		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		btnMas.setOnClickListener(this);
		btnIgual.setOnClickListener(this);
		btnBorrar.setOnClickListener(this);
		btnMenos.setOnClickListener(this);
		btnPor.setOnClickListener(this);
		btnDiv.setOnClickListener(this);

	}

	//Implementamos el evento onClick para los botones
	public void onClick(View v) {
		// El editText edtresultado  guardara lo que contiene
		//lo que contenga el editText en cada momento
		EditText edtResultado = (EditText) findViewById(R.id.edt1);

		//Gracias al metodo getId conseguimis la id de cada boton
		//Si la id coincide con la del boton creado 
		//asignaremos los valores que asignemos a cada boton al EditText
		if (v.getId() == R.id.btn0) {
			edtResultado.setText(edtResultado.getText().append("0"));
		}

		if (v.getId() == R.id.btn1) {
			edtResultado.setText(edtResultado.getText().append("1"));
		}
		if (v.getId() == R.id.btn2) {
			edtResultado.setText(edtResultado.getText().append("2"));
		}
		if (v.getId() == R.id.btn3) {
			edtResultado.setText(edtResultado.getText().append("3"));
		}
		if (v.getId() == R.id.btn4) {
			edtResultado.setText(edtResultado.getText().append("4"));
		}

		if (v.getId() == R.id.btn5) {
			edtResultado.setText(edtResultado.getText().append("5"));
		}

		if (v.getId() == R.id.btn6) {
			edtResultado.setText(edtResultado.getText().append("6"));
		}

		if (v.getId() == R.id.btn7) {
			edtResultado.setText(edtResultado.getText().append("7"));
		}

		if (v.getId() == R.id.btn8) {
			edtResultado.setText(edtResultado.getText().append("8"));
		}

		if (v.getId() == R.id.btn9) {
			edtResultado.setText(edtResultado.getText().append("9"));
		}

		//si clicamos sobre el boton "C" de borrar 
		//la información del EditText se eliminará
		if (v.getId() == R.id.btnC) {
			edtResultado.setText("");
		}
		//si clicamos sobre el boton "+" de sumar se almacenará
		//en la variable num1 el primer numero introducido en el EdiText
		//la variable suma=1 es para comprobar si hemos pulsado al boton "+"
		//para posteriormente realizar la suma
		
		//Ocurre lo mismo con los demas metodos para las distintas operaciones 
		//pero con su signo
		if (v.getId() == R.id.btnMas) {
			suma = 1;

			num1 = Integer.parseInt(edtResultado.getText().toString());
			edtResultado.setText("");
		}
		
		if (v.getId() == R.id.btnMenos) {
			resta = 1;

			num1 = Integer.parseInt(edtResultado.getText().toString());
			edtResultado.setText("");
		}

		if (v.getId() == R.id.btnPor) {
			mult = 1;

			num1 = Integer.parseInt(edtResultado.getText().toString());
			edtResultado.setText("");
		}

		if (v.getId() == R.id.btnDiv) {
			div = 1;

			num1 = Integer.parseInt(edtResultado.getText().toString());
			edtResultado.setText("");
		}

		//Si pretamos en el igual comprobaremos el tipo de operación 
		//que se debe realizar y se hará la operación
		//También almacenaremos el segundo número
		//de la operación, cuyo resultado
		//se almacenará en la variable "resultado"
		if (v.getId() == R.id.btnIgual) {

			num2 = Integer.parseInt(edtResultado.getText().toString());

			if (suma == 1) {
				resultado = num1 + num2;
				suma = 0;
			}
			if (resta == 1) {
				resultado = num1 - num2;
				resta = 0;
			}

			if (mult == 1) {
				resultado = num1 * num2;
				mult = 0;
			}
			if (div == 1) {
				resultado = num1 / num2;
				div = 0;
			}
			//Finalmente mostraremos el resultado por el edittext
			//habrá que convertir el rsultado de int a string para 
			//poder mostrarlo
			edtResultado.setText(Integer.toString(resultado));
		}

	}

}
