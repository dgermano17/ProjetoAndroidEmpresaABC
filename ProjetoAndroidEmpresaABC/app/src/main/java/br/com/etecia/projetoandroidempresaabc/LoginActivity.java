package br.com.etecia.projetoandroidempresaabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario, txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

    txtUsuario = (EditText) findViewById(R.id.edtUsuario);
    txtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void encerrarApp(View view) {
        finish();
    }

    public void entrarApp(View view) {
        String usuario = txtUsuario.getText().toString();
        String senha = txtSenha.getText().toString();

        if (usuario.equals("etecia") && senha.equals("etecia")){
            Toast.makeText(getApplicationContext(),"Bem-VIndo ao Sistema",Toast.LENGTH_SHORT);
        }else{
            Toast.makeText(getApplicationContext(),"Dados Inválidos",Toast.LENGTH_SHORT);

        }
    }
}
