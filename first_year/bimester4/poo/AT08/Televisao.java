public class Televisao implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        System.out.println("Televisão ligada");
        ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada");
        ligado = false;
    }
    
}