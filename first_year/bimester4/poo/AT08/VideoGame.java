public class VideoGame implements DispositivoEletronico {
    private boolean ligado;

    @Override
    public void ligar() {
        System.out.println("VideoGame ligado");
        ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("VideoGame desligado");
        ligado = false;
    }
    
}