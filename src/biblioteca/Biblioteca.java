package biblioteca;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

public class Biblioteca implements Subject {
    private List<Observer> observers = new ArrayList<>(); 

    public void adicionarLivro(String titulo) {
        System.out.println("Livro adicionado: " + titulo);
        notificarObservadores("Novo livro adicionado: " + titulo);
    }

    @Override
    public void adicionarObservador(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observer o : observers) {
            o.update(mensagem); 
        }
    }
}

