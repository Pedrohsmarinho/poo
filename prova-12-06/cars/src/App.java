public class App {
    public static void main(String[] args) throws Exception {
     
        Hidroaviao h1 = new Hidroaviao();

        h1.setModelo("Kodiak 100");
        h1.setFabricante("Quest Aircraft");

        System.out.println("modelo: " + h1.getModelo());
        System.out.println("fabricante: " + h1.getFabricante());
        h1.navegar();
        h1.flutuar();
        h1.voar();
    }
}
