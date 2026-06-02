public class Computador implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        System.out.println("Computador ligado");
        ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
        ligado = false;
    }
    
}