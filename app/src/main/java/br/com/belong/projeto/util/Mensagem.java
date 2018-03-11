package br.com.belong.projeto.util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

/**
 * Created by kildery on 10/03/18.
 */

public class Mensagem {
    /** Exibe uma mensagem na parte inferior do celular.*/
    public void rodapeRapido(View view, String mensagem) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }

    public void rodapeLongo(View view, String mensagem) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void rodapeIndefinido(View view, String mensagem) {
        Snackbar.make(view, mensagem, Snackbar.LENGTH_INDEFINITE)
                .setAction("Action", null).show();
    }

    /** Exibe uma mensagem no meio da tela*/
    public void toast(Context context, String mensagem){
        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }
}
