public class Hidroaviao extends Veiculo implements Aereo,Aquatico{

    @Override
    public void voar() {
      System.out.println("esse veiculo voa");
        
    }

    @Override
    public void flutuar() {
        System.out.println("esse veiculo flutua");
        
    }

    @Override
    public void navegar() {
        System.out.println("esse veiculo navega");
    }
    
}
