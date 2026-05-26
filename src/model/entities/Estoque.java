package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T> {

    private final List<T> pecas = new ArrayList<>();

    public Estoque() {
    }

    public List<T> getPecas() {
        return pecas;
    }

    public void transferirPecasDeEstoque(Estoque<? extends T> outroEstoque) {
        this.pecas.addAll(outroEstoque.getPecas());
    }

    public void mostrarEstoque() {
        if (pecas.isEmpty()) {
            throw new IllegalStateException("O estoque está vazio.");
        }
        for (T peca : pecas) {
            System.out.println(peca);
        }
    }

    public void adicionarPecas(T peca) {
        pecas.add(peca);
    }

}
