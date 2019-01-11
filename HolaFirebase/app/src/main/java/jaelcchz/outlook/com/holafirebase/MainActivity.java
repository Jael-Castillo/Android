package jaelcchz.outlook.com.holafirebase;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //Constates estaticas para facilitar el uso de las ramas
    //Estamos anidando Datos para ver como se contruye el JSON
    private static final String PHAT_START = "start";
    private static final String PHAT_MESSAG = "message";
    //Pluguin: Permiten vincular, aparitr de VARIABLES GLOBALES, los elementos de la VISTA
    @BindView(R.id.etMessage)
    EditText etMessage;
    @BindView(R.id.btnSend)
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);//Parte de Pluguin

        //Decalración de Constante constante para vincular el componente
        final TextView tvMessage = findViewById(R.id.tvMessage);

        //Variable para la BASE DE DATOS
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        //Referencia a la ruta a la cual queremos LEER o ESCRIBIR.
        //podemos acceder a las ramas apartir de .child()
        final DatabaseReference reference = database.getReference(PHAT_START).child(PHAT_MESSAG);

        //CONSULTA DEL DATO
        reference.addValueEventListener(new ValueEventListener() {
            //1er Método Cambio de los datos de la referencia establecida
            //contendra todos los valoes de la ruta DataSnapshot dataSnapshot
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //Extraer el valor de la CLASE
                tvMessage.setText(dataSnapshot.getValue(String.class));
            }

            //2do Método, aquí manipulamos los errores
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Error al consultar el Firebase.",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
    //OnClick para Enviar el mensaje
    @OnClick(R.id.btnSend)
    public void onViewClicked() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference reference = database.getReference(PHAT_START).child(PHAT_MESSAG);

        //Enviar el Mensaje
        reference.setValue(etMessage.getText().toString().trim());
        //Borrar mesaje de TexView
        etMessage.setText("");
    }
}
