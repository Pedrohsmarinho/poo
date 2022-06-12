package q3.src;
public class App {
    public static void main(String[] args) throws Exception {

        Mouse m1 = new Mouse();

       m1.setFabricante("Razer");
       m1.setNome("Deathadder Essential");
    
       System.out.println("---------------------");
       System.out.println("Nome: " + m1.getNome());
       System.out.println("---------------------");
       System.out.println("Fabricante: " + m1.getFabricante());
       System.out.println("---------------------");
       m1.ativar();
       System.out.println("---------------------");
       m1.uso();
       System.out.println("---------------------");
       m1.desativar();
       System.out.println("---------------------");

    }
}
