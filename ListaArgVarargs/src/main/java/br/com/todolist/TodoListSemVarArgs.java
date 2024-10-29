package br.com.todolist;


import java.util.ArrayList;
import java.util.List;

public class TodoListSemVarArgs {
    List<String> todoList = new ArrayList<>();

    //três métodos que fazem a mesma coisa, unica coisa que muda é a quantidade
    //isso são métodos sobrecarregados
    public void adicionarTarefas(String tarefa){todoList.add(tarefa);}
    public void adicionarDuasTarefas(String tarefa1, String tarefa2){
        todoList.add(tarefa1);
        todoList.add(tarefa2);
    }
    public void adicionarTarefas(String[] tarefas){
        for (String tarefa : tarefas){
            todoList.add(tarefa);
        }
    }


    public static void main(String[] args) {
        TodoListSemVarArgs exemplo = new TodoListSemVarArgs();

        exemplo.adicionarTarefas("Estudar java");
        exemplo.adicionarDuasTarefas("Estudar java", "Praticar exercicios");
        exemplo.adicionarTarefas(new String[]{ "Ler livros", "Descansar", "Assistir video aulas"});
    }
}