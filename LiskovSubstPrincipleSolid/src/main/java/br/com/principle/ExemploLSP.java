package br.com.principle;


//o PRINCIPIO LSP afirma que as intancias de uma subclasse podem ser
//    substituidas por instancias de sua superclasse




import java.util.List;//superclass
class Animal{
    public String toString(){
        return "Sou um animal";
    }
}

//subclass
class Gato extends Animal{
    public String toString(){
        return "Sou um gato";
    }
}

//subclass
class Cachorro extends Animal{
    public String toString(){
        return "Sou um cachorro";
    }
}



public class ExemploLSP {
//e se a gente imprimir uma lista de animais?
    //SEM WILDCARD
//    public static void imprimirListaAnimais(List<Animal> animais){

    //COM WILDCARD
    //Ele poderá ser qualquer tipo desde que extenda de Animal
 public static void imprimirListaAnimais(List<? extends Animal> animais){
        for (Animal animal : animais){
            System.out.println(animal);
        }
    }


    public static void main(String[] args) {

        //Está correto essa lista com generics porém
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        System.out.println(gato);
        System.out.println(cachorro);

        List<Animal> listAnimal = List.of(gato, cachorro);
        imprimirListaAnimais(listAnimal);

        //e se imprimirmos uma lista só com os gatos?
        //ficamos impossibilitados pois a lista é somente animais
        //limitação do polimorfismo ferindo o LSP
        Gato novoGato = new Gato();
        List<Gato> listGatos = List.of(novoGato);
        imprimirListaAnimais(listGatos);
        //Para resolver este erro
        //Utilizamos O WILDCARD
        Cachorro novoCachorro = new Cachorro();
        List<Cachorro> listaCachorro = List.of(novoCachorro);
        imprimirListaAnimais(listaCachorro);

    }


}