public class SistemaEletronicos {
    public void ligarTodos() {
        Computador computador = new Computador();
        computador.ligar();
        VideoGame videoGame = new VideoGame();
        videoGame.ligar();
        Televisao televisao = new Televisao();
        televisao.ligar();
    }

    public void desligarTodos() {
        Computador computador = new Computador();
        computador.desligar();
        VideoGame videoGame = new VideoGame();
        videoGame.desligar();
        Televisao televisao = new Televisao();
        televisao.desligar();
    }
    
}