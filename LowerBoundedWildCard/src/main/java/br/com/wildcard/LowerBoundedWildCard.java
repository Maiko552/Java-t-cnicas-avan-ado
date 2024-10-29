package br.com.wildcard;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCard {

    //Diferente do Upper WildCard que extend da super class
    //o Lower apenas aceita a SuperClasse ou a propria classe
    public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list){
        System.out.println(list);
    }




    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 4, 5);
        List<Number> numbers = Arrays.asList(4.9, 7.7, 8.2, 10.0);

        //aceita listas de inteiros ou da superclasse
        printOnlyIntegerClassorSuperClass(integers);
        printOnlyIntegerClassorSuperClass(numbers);

        //nao aceita double
        List<Double> doubles = Arrays.asList(1.2, 5.3);
        printOnlyIntegerClassorSuperClass(doubles);
    }
}