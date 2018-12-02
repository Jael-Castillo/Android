package jaelcchz.outlook.com.orderburguer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;

import static android.provider.UserDictionary.Words.LOCALE;

public class ScrollingActivity extends AppCompatActivity {

    //---------------------DECLARACIÓN DE VARIABLES------------------------------//
    enum Hamburguesas {
        BURGERJOINT, BUTCHERSONS, UMAMIBURGER, FLIPPINBURGERS, FERBURGER;
    }
    private CheckBox[] hamburguesas;
    private TextView salida;
    private int suma;


    private static final Locale LOCALE = Locale.US;
    private static final NumberFormat fmt = NumberFormat
            .getCurrencyInstance(LOCALE);




    //--------------ASIGNANCIÓN-----------------------//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        hamburguesas = new CheckBox[] {
                (CheckBox) findViewById(R.id.burgerjoint),
                (CheckBox) findViewById(R.id.butchersons),
                (CheckBox) findViewById(R.id.umamiburger),
                (CheckBox) findViewById(R.id.flippinburgers),
                (CheckBox) findViewById(R.id.ferburger) };
        salida = (TextView) findViewById(R.id.salida);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EnumSet<Hamburguesas> seleccion = EnumSet.noneOf(Hamburguesas.class);
                int resu=0;
                for (CheckBox cb : hamburguesas){
                    if (cb.isChecked()) {
                        switch (cb.getId()) {
                            case R.id.burgerjoint:
                                seleccion.add(Hamburguesas.BURGERJOINT);
                                resu += suma + 55;
                                break;
                            case R.id.butchersons:
                                seleccion.add(Hamburguesas.BUTCHERSONS);
                                resu += suma + 63;
                                break;
                            case R.id.umamiburger:
                                seleccion.add(Hamburguesas.UMAMIBURGER);
                                resu += suma +65;
                                break;
                            case R.id.flippinburgers:
                                seleccion.add(Hamburguesas.FLIPPINBURGERS);
                                resu += suma + 70;
                                break;
                            case R.id.ferburger:
                                seleccion.add(Hamburguesas.FERBURGER);
                                resu += suma +71;
                                //	continue;
                        }
                    }
                }
                salida.setText("Hamburguesa seleccionada: "+ seleccion.toString());

                Snackbar.make(view,  seleccion.size() != 0 ? "TOTAL A PAGAR: "+ String.valueOf(resu): "TOTAL A PAGAR: 0", Snackbar.LENGTH_LONG)
                        .setAction("Action" , null).show();

            }
        });
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
