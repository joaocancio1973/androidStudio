package com.example.myappjava.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.myappjava.R;
import com.example.myappjava.controller.PessoaController;
import com.example.myappjava.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;

    Pessoa pessoa;


    EditText editFirstName;
    EditText editLastName;
    EditText editCursoDesejado;
    EditText editTelefoneContato;

    Button btnFinalizar;
    Button btnSalvar;
    Button btnLimpar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController();
        controller.toString();


        pessoa = new Pessoa();
        pessoa.setFirstName("João");
        pessoa.setLastName("Cancio");
        pessoa.setCursoDesejado("Java");
        pessoa.setPhoneContato("71991605834");

        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        editFirstName.setText(pessoa.getFirstName());
        editLastName.setText(pessoa.getLastName());
        editCursoDesejado.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getPhoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editFirstName.setText("");
                editLastName.setText("");
                editCursoDesejado.setText("");
                editTelefoneContato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Aplicativo finalizado, até mais!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setFirstName(editFirstName.getText().toString());
                pessoa.setLastName(editLastName.getText().toString());
                pessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                pessoa.setPhoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Registrado", Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);

            }
        });
    }
}