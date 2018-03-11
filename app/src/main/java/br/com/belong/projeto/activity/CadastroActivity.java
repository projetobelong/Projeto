package br.com.belong.projeto.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import br.com.belong.projeto.R;
import br.com.belong.projeto.util.Mensagem;

public class CadastroActivity extends AppCompatActivity {
    TextInputEditText edtNome, edtEmail, edtDtNasc;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /** Definição dos Campos de preenchimento do cadastro simples*/
        edtNome   = (TextInputEditText) findViewById(R.id.edtNome);
        edtEmail  = (TextInputEditText) findViewById(R.id.edtEmail);
        edtDtNasc = (TextInputEditText) findViewById(R.id.edtDtNasc);

        /** */
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupMF);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Mensagem m = new Mensagem();
                switch (i){
                    case R.id.rbMasculino:
                        m.toast(CadastroActivity.this, "Masculino");
                        break;
                    case R.id.rbFeminino:
                        m.toast(CadastroActivity.this, "Feminino");
                        break;

                }
            }
        });

        FloatingActionButton floatCadastrar =
                (FloatingActionButton) findViewById(R.id.floatCadastro);
    }

    public void cadastrar(View view){
         Mensagem m = new Mensagem();
         m.rodapeRapido(view, "Clicou em Cadastrar");
    }

    public void info(View view){
        Mensagem m = new Mensagem();
        m.rodapeLongo(view, "Identifique-se para acessar!");
    }

}
