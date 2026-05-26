package model.entities;

public class MemoriaRam extends Peca {

    public MemoriaRam() {
    }

    public MemoriaRam(String nomePeca, Integer quantidadePeca, Double valorPeca) {
        super(nomePeca, quantidadePeca, valorPeca);
    }

    @Override
    public String toString() {
        return "Memória Ram: " + getNomePeca() + ", Quantidade em estoque: " + getQuantidadePeca() + ", Valor: R$" + getValorPeca();
    }
}
