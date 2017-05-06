package com.example.iossenac.applogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.iossenac.applogin.model.Usuario;
import java.util.ArrayList;
import java.util.List;

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


        Usuario usuario = new Usuario(textoUser,textoSenha);

        if(this.getUsuariosInicial().contains(usuario )) {
            Toast.makeText(this, "Login realizado com sucesso!",
                    Toast.LENGTH_SHORT
            ).show();

            Log.i("TagLogin", "Login realizado com sucesso!");
        }
        else
        {
            Toast.makeText(this, "Login falhou! Usuario ou senha incorretos!",
                    Toast.LENGTH_SHORT).show();
             Log.e("TagLogin", "Login falhou! Usuario ou senha incorretos!");
          }



    }

    private List<Usuario> getUsuariosInicial()
    {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("user1","123"));
        listaUsuarios.add(new Usuario("user2","123"));
        listaUsuarios.add(new Usuario("user3","123"));
        listaUsuarios.add(new Usuario("user4","123"));
        listaUsuarios.add(new Usuario("user5","123"));
        return listaUsuarios;
    }




}
