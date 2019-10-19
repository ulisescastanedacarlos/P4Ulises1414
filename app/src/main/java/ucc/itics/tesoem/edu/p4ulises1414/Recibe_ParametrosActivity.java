package ucc.itics.tesoem.edu.p4ulises1414;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recibe_ParametrosActivity extends AppCompatActivity {
    TextView vnombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe__parametros);
    vnombre=(TextView)findViewById(R.id.lblnombre);

    Bundle parametros = getIntent().getExtras();

    vnombre.setText("Bienvenido"+ parametros.getString("nombre"));
    }
}
