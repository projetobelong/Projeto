package br.com.belong.projeto.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.belong.projeto.R;

public class InicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
    }

    public void btnAcessar(View view){
        Intent acessar = new Intent(this, CadastroActivity.class);
        acessar.putExtra("HelloWord", "HelloWord");
        startActivity(acessar);

    }
}
