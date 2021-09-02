package entities;

public class PessoasFisicas extends Pessoas {

    private Double gastosSaude;

    public PessoasFisicas(){
    }

    public PessoasFisicas(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.setGastosSaude(gastosSaude);
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
    @Override
    public double impostos(){
        double soma = 0.0;
        
        if(getRendaAnual() < 20000.00){
            soma = getRendaAnual() * 0.15; 
        }
        else {
            soma = getRendaAnual() * 0.25;
        } 
        soma = soma - (gastosSaude * 0.5);
        if(gastosSaude < 0.0){
            return 0.0;
        }else{
            return soma;
        }
    }
}
