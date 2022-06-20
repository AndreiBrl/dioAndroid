package com.example.agenda;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    //onCreate metodo para sobrescrever o activity
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    // A classe R acessa todos os resources da pasta res. Desta forma facilita implementações
        setContentView(R.layout.activity_main);
        List<String> alunos= new ArrayList<>(
                Arrays.asList("Alex","Fran","Jose"));
       ListView ListaDeAlunos = findViewById(R.id.activity_main_lista_de_alunos);
       ListaDeAlunos.setAdapter(new ArrayAdapter<String>(this,));

    }
}


