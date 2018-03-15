package br.com.belong.projeto.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import br.com.belong.projeto.R;
import br.com.belong.projeto.util.Mensagem;

public class CadastroActivity extends AppCompatActivity {
    AutoCompleteTextView userNome, userEmail, userDtNasc;
    Spinner spnMascFem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        //inserindo background
        getWindow().setBackgroundDrawableResource(R.drawable.bg_melancia);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userNome   = (AutoCompleteTextView) findViewById(R.id.userNome);
        userEmail  = (AutoCompleteTextView) findViewById(R.id.userEmail);
        userDtNasc = (AutoCompleteTextView) findViewById(R.id.userDtNasc);

        spnMascFem = (Spinner) findViewById(R.id.spnMascFem);

        String [] sexo = {"Escolha uma opção...","MASCULINO", "FEMININO"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sexo);
        spnMascFem.setAdapter(adapter);

    }

    public void cadastrar(View view){
         Mensagem m = new Mensagem();
        Intent c = new Intent(this, MainActivity.class);
        /**Validação dos campos obrigatórios*/
        if(!userNome.getText().toString().toString().isEmpty() &&
                !userEmail.getText().toString().toString().isEmpty()){
        c.putExtra("nome", userNome.getText().toString());
        c.putExtra("email", userEmail.getText().toString());
        startActivity(c);
        }else{
            m.rodapeLongo(view, "Preencha os campos!");
        }

    }
}
