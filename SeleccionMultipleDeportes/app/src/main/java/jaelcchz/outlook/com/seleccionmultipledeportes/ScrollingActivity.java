package jaelcchz.outlook.com.seleccionmultipledeportes;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.EnumSet;

public class ScrollingActivity extends AppCompatActivity{

    //---------------------DECLARACIÓN DE VARIABLES------------------------------//
    enum Deportes {
        AMERICANO, CRIQUET, GIMNASIA, ESGRIMA, TIROARCO;
    }
    private Button btn_seleccion;
    private Button btn_limpiar;
    private CheckBox[] deportes;
    private TextView salida;
    private FloatingActionButton fabAceptar;
    private CoordinatorLayout coordinatorLayout;
    private ImageView deporte;

//--------------ASIGNANCIÓN-----------------------//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        deporte = (ImageView) findViewById(R.id.deporte);
        salida = (TextView) findViewById(R.id.salida);
        btn_seleccion = (Button)findViewById(R.id.btn_seleccion);
        deportes = new CheckBox[] {
                (CheckBox) findViewById(R.id.americano),
                (CheckBox) findViewById(R.id.criquet),
                (CheckBox) findViewById(R.id.gimansia),
                (CheckBox) findViewById(R.id.esgrima),
                (CheckBox) findViewById(R.id.tiroArco) };
        btn_seleccion = (Button)findViewById(R.id.btn_seleccion);
        btn_limpiar = (Button)findViewById(R.id.btn_limpiar);

//--------------------Selección en el boton email.---------------------------//
        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);*/



//---------------------BOTON SELECCIÓN-------------------------------//


        btn_seleccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EnumSet<Deportes> seleccion = EnumSet.noneOf(Deportes.class);
                for (CheckBox cb : deportes) {
                    if (cb.isChecked()) {
                        switch (cb.getId()) {
                            case R.id.americano:
                                seleccion.add(Deportes.AMERICANO);
                                deporte.setImageResource(R.drawable.americano);
                                continue;
                            case R.id.criquet:
                                seleccion.add(Deportes.CRIQUET);
                                deporte.setImageResource(R.drawable.criquet);
                                continue;
                            case R.id.gimansia:
                                seleccion.add(Deportes.GIMNASIA);
                                deporte.setImageResource(R.drawable.gimnasia);
                                continue;
                            case R.id.esgrima:
                                seleccion.add(Deportes.ESGRIMA);
                                deporte.setImageResource(R.drawable.esgrima);
                                continue;
                            case R.id.tiroArco:
                                seleccion.add(Deportes.TIROARCO);
                                deporte.setImageResource(R.drawable.tiroconarco);
                                //	continue;
                        }
                    }
                }
                salida.setText(seleccion.toString());


                Snackbar.make(view, seleccion.size() == 1 ? "Deporte Seleccionado" : "Por favor selecciona sólo un deporte", Snackbar.LENGTH_LONG)
                        .setAction("Selección Unica", null).show();
            }
        });
    }

//---------------------BOTON BORRAR-------------------------------//
        public void Limpiar(View view){
            deporte.setImageDrawable(null);
            salida.setText("");
            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
