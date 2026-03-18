public class Main {
    public static void main() {
        CursoProgramacao cursoProgramacao = new CursoProgramacao("Titulo", "Professor", 30, "Python");
        CursoDesign cursoDesign = new CursoDesign("Titulo2", "Professor2", 30, "Figma");

        System.out.println("toString - cursoProgramacao");
        System.out.println(cursoProgramacao.toString());
        System.out.println("\ntoString - cursoDesign");
        System.out.println(cursoDesign.toString());

        System.out.println("\nexibirInformacoes - cursoProgramacao");
        cursoProgramacao.exibirInformacoes();
        System.out.println("\nexibirInformacoes - cursoDesign");
        cursoDesign.exibirInformacoes();
        
        System.out.println("\nDuração media das aulas - cursoProgramacao");
        System.out.println(cursoProgramacao.classesAvarageTime(5, 1));
        System.out.println("\nDuração media das aulas - cursoDesign");
        System.out.println(cursoDesign.classesAvarageTime(10, 2));
    }  
}