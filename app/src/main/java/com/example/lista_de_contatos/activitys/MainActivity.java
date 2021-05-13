package com.example.lista_de_contatos.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lista_de_contatos.R;
import com.example.lista_de_contatos.adapter_entities.AdapterList;
import com.example.lista_de_contatos.model_entitie.DataList;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataList> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        this.lista_contatos();
        //configuração da recycler view
        AdapterList adapter = new AdapterList(lista);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


    }

    public void lista_contatos(){
        DataList adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Renato","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Joao","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Pedro","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Marcos","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Lucas","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Fabio","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Samuel","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Camila","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Lucio","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Lucia","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Carmelia","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Renata","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Lidiane","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Ronildo","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Viviane","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Samira","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");
        adapterList = new DataList("Natã","26/04/2021","Av Pedro Álvares Cabral");
        lista.add(adapterList);
        adapterList = new DataList("Maria","01/02/2021","Rua Oceano Pacifico");

    }

}