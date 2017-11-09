package com.example.muzayyinul.kuismatematika;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Muzayyinul on 09/11/2017.
 */

public class SharedP {

    SharedPreferences sp;
    SharedPreferences.Editor editor;
    Context context;
    int private_mode = 0;
    private static final String PREF_NAME = "penyimpanannilai";

    public SharedP (Context context) {
        this.context = context;
        sp = context.getSharedPreferences(PREF_NAME, private_mode);
        editor = sp.edit();
    }

    public void setNilaiBenar(int inputUser) {
        editor.putInt("nilBenar", inputUser);
        editor.commit();
    }

    public void setNilaiSalah(int inputUser) {
        editor.putInt("nilSalah", inputUser);
        editor.commit();
    }

    public int getNilaiBenar() {
        return sp.getInt("nilBenar", 0);

    }

    public int getNilaiSalah() {
        return sp.getInt("nilSalah", 0);
    }

}
