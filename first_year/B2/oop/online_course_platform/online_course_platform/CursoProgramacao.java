public class CursoProgramacao extends Curso {

    public String linguagem;

    public CursoProgramacao(String titulo, String instrutor, int cargaHoraria, String linguagem) {
        super(titulo, instrutor, cargaHoraria);
        this.linguagem = linguagem;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(this.linguagem);

    }

    @Override
    public String toString() {
        return super.toString() + ", linguagem: " + this.linguagem + "";
    }
}