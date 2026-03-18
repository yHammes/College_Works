public class Moto extends Veiculo {
    int rodas;
    
    public Moto(String marca, String modelo , int rodas){
        this.rodas = rodas;
    }
        
    public String exibirDados() {
        super.exibirDados()
        return "\nrodas:" + this.rodas; 
    }

    public Strint toString() {
        return ""
    }
}