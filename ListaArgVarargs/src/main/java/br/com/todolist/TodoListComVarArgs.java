package br.com.todolist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListComVarArgs {
    List<String> todoList = new ArrayList<>();

    //Utilizando varargs e streams com lambda
    //
    public void adicionarTarefas(String... tarefas) {
                                       //variavel de referencia: para cada elemento tarefa será aplicada a condição todoList.add
        Arrays.stream(tarefas).forEach(tarefa -> todoList.add(tarefa));
       }

    @Override
    public String toString() {
        return "TodoList: " + todoList;
    }

    public static void main(String[] args) {
        TodoListComVarArgs exemplo = new TodoListComVarArgs();

        exemplo.adicionarTarefas("Estudar java");
        exemplo.adicionarTarefas("Estudar java", "Fazer exercícios");
        exemplo.adicionarTarefas(new String[]{"Ler livros", "Descansar", "Assistir video aulas"});

        System.out.println(exemplo);
    }
}