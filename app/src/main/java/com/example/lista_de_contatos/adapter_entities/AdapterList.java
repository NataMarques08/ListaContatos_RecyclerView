package com.example.lista_de_contatos.adapter_entities;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lista_de_contatos.R;
import com.example.lista_de_contatos.model_entitie.DataList;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder>{
    List<DataList> lists;

    public AdapterList() {
    }

    public AdapterList(List<DataList> lists) {
        this.lists = lists;
    }

    @NonNull
    @NotNull
    @Override
    public AdapterList.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.adapter_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterList.ViewHolder holder, int position) {
        DataList dataList = lists.get(position);
        holder.nome.setText(dataList.getName());
        holder.data.setText(dataList.getData());
        holder.endereco.setText(dataList.getAddress());
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nome;
        TextView data;
        TextView endereco;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.contact_name);
            data = itemView.findViewById(R.id.text_data);
            endereco = itemView.findViewById(R.id.text_endereco);
        }
    }

}

