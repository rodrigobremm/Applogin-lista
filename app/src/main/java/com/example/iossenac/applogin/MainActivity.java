package com.example.iossenac.applogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void verificaLogin(View v) {


        EditText username = (EditText)
                findViewById(R.id.textUser);
        String textoUser = username.getText().toString();


        EditText password = (EditText)
                findViewById(R.id.textSenha);
        String textoSenha = password.getText().toString();


        if(username.getText().toString().equals("rodrigo") &&
                password.getText().toString().equals("senha")){
            Toast.makeText(this,"Login efetuado com sucesso!",
                    Toast.LENGTH_SHORT
            ).show();
            Log.i("TagOK","Login efetuado com sucesso!!!");
        } else {
            Toast.makeText(this,"Usuário ou Senha incorreto!",
                    Toast.LENGTH_SHORT
            ).show();
            Log.i("TagErro","Usuário ou Senha incorreto!!!");
        }


    }



}
