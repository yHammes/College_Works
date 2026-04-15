public class CursoDesign extends Curso {
    public String softwareUtilizado;

    public CursoDesign(String titulo, String instrutor, int cargaHoraria, String softwareUtilizado) {
        super(titulo, instrutor, cargaHoraria);
        this.softwareUtilizado = softwareUtilizado;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println(this.softwareUtilizado);

    }

    @Override
    public String toString() {
        return super.toString() + ", softwareUtilizado: " + this.softwareUtilizado;
    }
}