public class Main {

    static void main() {
        Basquete basquete = new Basquete(10, 1.80);
        Futebol futebol = new Futebol("Campeonato municipal", 10);
        Natacao natacao = new Natacao("Grande", 21);
        
        basquete.setNomeTreinador("Adriano");
        futebol.setNomeTreinador("Adriano");
        natacao.setNomeTreinador("Adriano");
        
        basquete.registrarTreino("28/10/2004");
        basquete.registrarTreino("28/10/2004", 60);
        
        System.out.println(basquete.toString());
        System.out.println(futebol.toString());
        System.out.println(natacao.toString());
    }
}
