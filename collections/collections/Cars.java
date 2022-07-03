public class Cars {
    private String model;
    private String produtor;
    private int year;
    private double price;

    Cars(String model, String productor, int year, double price) {
        this.model = model;
        this.produtor = productor;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public String getProdutor() {
        return produtor;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }

    @Override 
    public String toString() {
        return "[Car: " + this.model + ", " + "R$" + this.price + "]";
      }
    
}
