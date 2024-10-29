package com.generics;


import java.util.ArrayList;
import java.util.List;

//Classe com alias para o main indentificar qual sera o tipo passado
public class ListaComGenerics<T> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T objeto){
        lista.add(objeto);
    }
    public T obter(int indice){
        return lista.get(indice);
    }


    public static void main(String[] args) {
        //Exemplo sem o uso de generics
        ListaComGenerics<Integer> numeros = new ListaComGenerics<>();
        numeros.adicionar(1);
        numeros.adicionar(2);
        ListaComGenerics<String> textos = new ListaComGenerics<>();
        textos.adicionar("Olá");
        textos.adicionar("Mundo");

        //tipo de dado do paramentro é int
        int numero = numeros.obter(0);
        System.out.println(numero);

        //ocasionará erro pois o tipo de dados do paramentro é int
        String texto = textos.obter(0);
        System.out.println(texto);
    }
}