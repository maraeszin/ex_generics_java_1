package model.entities;

public class PlacaMae extends Peca {


    public PlacaMae() {
    }

    public PlacaMae(String nomePeca, Integer quantidadePeca, Double valorPeca) {
        super(nomePeca, quantidadePeca, valorPeca);
    }

    @Override
    public String toString() {
        return "Placa-Mãe: " + getNomePeca() + ", Quantidade em estoque: " + getQuantidadePeca() + ", Valor: R$" + getValorPeca();
    }

}
