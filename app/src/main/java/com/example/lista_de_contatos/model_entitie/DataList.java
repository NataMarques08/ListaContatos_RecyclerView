package com.example.lista_de_contatos.model_entitie;

public class DataList {
    private String name;
    private String data;
    private String address;

    //CONSTRUTOR PADRÃO
    public DataList(){ }

    public DataList(String name, String data, String address) {
        this.name = name;
        this.data = data;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
