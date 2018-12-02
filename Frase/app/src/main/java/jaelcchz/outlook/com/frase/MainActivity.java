package jaelcchz.outlook.com.frase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //Libreria
import android.widget.Button;
import android.widget.EditText;//Frase
import android.widget.TextView;//Introducir Frase
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtTexto;
    TextView txtFrase;
    TextView txtTotal;
    Button boton;
    Button boton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTexto = (EditText)findViewById(R.id.texto1);
        txtFrase = (TextView)findViewById(R.id.texto2);
        txtTotal = (TextView)findViewById(R.id.total);
        boton = (Button)findViewById(R.id.enviar);
        boton1 = (Button)findViewById(R.id.limpiar);

        boton.setOnClickListener(this);

}

    @Override
    public void onClick(View v) {
        //Captura del texto en variable "strFrase", para pasarla posteriormente al edtTexto que es EditTex
        String strFrase = edtTexto.getText().toString();
        txtFrase.setText(strFrase);
        txtTotal.setText(String.valueOf("total de caracteres es: "+ strFrase.length()));
        Toast.makeText(MainActivity.this,strFrase,Toast.LENGTH_SHORT).show();//Es Toat es un elemento para que se visualice la frase

    }


    public void Limpiar (View v){

        txtFrase.setText("");
        edtTexto.setText("");
        txtTotal.setText("");
    }


}


