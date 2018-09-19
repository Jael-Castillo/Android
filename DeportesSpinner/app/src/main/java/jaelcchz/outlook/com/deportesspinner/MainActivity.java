package jaelcchz.outlook.com.deportesspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView lblSeleccionDepo;
    private Spinner cmbOpciones;
    private Spinner cmbOpciones2;
    private ImageView deporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lblSeleccionDepo = (TextView) findViewById(R.id.lblSeleccionDepo);
        cmbOpciones = (Spinner) findViewById(R.id.cmbOpciones);
        cmbOpciones2 = (Spinner)findViewById(R.id.cmbOpciones2);
        deporte = (ImageView) findViewById(R.id.deporte);
        final ArrayList<String> datos = new ArrayList<String>();

// Elegir deportes
        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource(this,
                        R.array.valores_array,
                        android.R.layout.simple_spinner_item);
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);

//Deportes Seleccionados
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        adaptador2.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones2.setAdapter(adaptador2);

        cmbOpciones.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v,
                                               int position,
                                               long id) {
                        lblSeleccionDepo.setText("Elige un deporte:");
                        String nuevoDato = parent.getSelectedItem().toString().trim();
                        if (nuevoDato.length() > 1) {
                        switch (position) {
                            case 0:
                                break;
                            case 1:
                                deporte.setImageResource(R.drawable.americano);
                                break;
                            case 2:
                                deporte.setImageResource(R.drawable.criquet);
                                break;
                            case 3:
                                deporte.setImageResource(R.drawable.gimnasia);
                                break;
                            case 4:
                                deporte.setImageResource(R.drawable.remo);
                                break;
                            case 5:
                                deporte.setImageResource(R.drawable.rugby);
                                break;
                            case 6:
                                deporte.setImageResource(R.drawable.tiroconarco);
                                break;
                            case  7:
                                deporte.setImageResource(R.drawable.esgrima);
                                break;
                        }
                        datos.add(nuevoDato);
                        }
                    }


                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        lblSeleccionDepo.setText("");

                    }
                });
        }
    }