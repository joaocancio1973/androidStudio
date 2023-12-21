package com.example.myappjava.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.myappjava.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controladora Iniciada");


        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Arquivo Salvo");

    }
}
