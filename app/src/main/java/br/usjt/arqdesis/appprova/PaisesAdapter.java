package br.usjt.arqdesis.appprova;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Oscar B. Cardoso Ra 201517189.
 */
public class ClienteAdapter extends BaseAdapter {
    Paises[] paises;
    Activity context;

    public ClienteAdapter(Activity context, Paises[] clientes){
        this.context = context;
        this.paises = clientes;
    }

    @Override
    public int getCount() {
        return paises.length;
    }

    @Override
    public Object getItem(int i) {
        if(i >= 0 && i < paises.length){
            return paises[i];
        }
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
