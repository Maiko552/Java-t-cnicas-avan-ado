package com.generics;


import java.util.ArrayList;
import java.util.List;


public class Lista {
    private List<Object> lista = new ArrayList<>();

    public void adicionar(Object objeto){
        lista.add(objeto);
    }
    public Object obter(int indice){
        return lista.get(indice);
    }


    public static void main(String[] args) {
        //Exemplo sem o uso de generics
        Lista numeros = new Lista();
        numeros.adicionar(1);
        numeros.adicionar(2);
        Lista textos = new Lista();
        textos.adicionar("Olá");
        textos.adicionar("Mundo");

        //tipo de dado do paramentro é int
        int numero = (int) numeros.obter(0);
        System.out.println(numero);

        //ocasionará erro pois o tipo de dados do paramentro é int
        String texto = (String) numeros.obter(0);
        System.out.println(texto);
    }
}