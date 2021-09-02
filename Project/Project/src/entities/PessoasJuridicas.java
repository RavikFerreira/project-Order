package entities;

public class PessoasJuridicas extends Pessoas{

    private Integer numFuncionarios;

    public PessoasJuridicas(){
    }

    public PessoasJuridicas(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.setNumFuncionarios(numFuncionarios);
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }
    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }
    @Override
    public double impostos(){
        double soma = 0; 
        if(numFuncionarios > 10){
            soma = getRendaAnual() * 0.14; 

        }else{
            soma = getRendaAnual() * 0.16;
        }
        return soma;
    }    
}
