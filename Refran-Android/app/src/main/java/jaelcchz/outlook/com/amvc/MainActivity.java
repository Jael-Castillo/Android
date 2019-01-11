package jaelcchz.outlook.com.amvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre1;
    private EditText nombre2;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre1 = findViewById(R.id.nombre1);
        nombre2 = findViewById(R.id.nombre2);
        respuesta = findViewById(R.id.respuesta);
    }
    public void saluda(View v){
        try {
            InfoSaludo.nombre1 = nombre1.getText().toString().trim();
            InfoSaludo.nombre2 = nombre2.getText().toString().trim();
            if (InfoSaludo.nombre1.trim().isEmpty()) {
                throw new Exception(getString(R.string.falta_el_nombre_1));
            } else if (InfoSaludo.nombre2.trim().isEmpty()) {
                throw new Exception(getString(R.string.falta_el_nombre_2));
            }
            InfoSaludo.respuesta = getString(R.string.formato_del_saludo,
                    InfoSaludo.nombre1, InfoSaludo.nombre2);
        }catch (Exception e) {
            InfoSaludo.respuesta = e.getLocalizedMessage();
        }
        respuesta.setText(InfoSaludo.respuesta);
    }
}
