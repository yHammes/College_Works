public class Curso {

    public String titulo;
    public String instrutor;
    public int cargaHoraria;

    public Curso(String titulo, String instrutor, int cargaHoraria) {
        this.titulo = titulo;
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
    }

    public float classesAvarageTime(int aulas) {
        return this.cargaHoraria / aulas;
    }

    public float classesAvarageTime(int aulas, int aula_extras) {
        return this.cargaHoraria / (aulas + aula_extras);
    }

    public void exibirInformacoes() {
        System.out.println(this.titulo);
        System.out.println(this.instrutor);
        System.out.println(this.cargaHoraria);
    }

    public String toString() {
        return "titulo: " + this.titulo + ", instrutor" + this.instrutor + ", cargaHoraria: " + this.cargaHoraria;
    }
}