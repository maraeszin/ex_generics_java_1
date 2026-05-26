package model.entities;

public class Peca {

    private String nomePeca;
    private Integer quantidadePeca;
    private Double valorPeca;

    public Peca() {
    }

    public Peca(String nomePeca, Integer quantidadePeca, Double valorPeca) {
        this.nomePeca = nomePeca;
        this.quantidadePeca = quantidadePeca;
        this.valorPeca = valorPeca;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public Integer getQuantidadePeca() {
        return quantidadePeca;
    }

    public void setQuantidadePeca(Integer quantidadePeca) {
        this.quantidadePeca = quantidadePeca;
    }

    public Double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(Double valorPeca) {
        this.valorPeca = valorPeca;
    }
}
