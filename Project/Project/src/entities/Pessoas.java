package entities;

public abstract class Pessoas {

    private String nome;
    private Double rendaAnual;

    public Pessoas(){
    }
    public Pessoas(String nome, Double rendaAnual) {
        this.setNome(nome);
        this.setRendaAnual(rendaAnual);
       
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double impostos();
    
}
