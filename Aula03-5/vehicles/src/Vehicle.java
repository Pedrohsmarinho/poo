public class Vehicle {
    private String manufacturer;
    private String model;
    private String plate;
    protected String chassi;
    private int year;

    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
        
    }
    public void setModel(String model) {
        this.model = model;
}
    @Override
     public String toString(){
        return 
        "model: " + model + "" + "\n" + 
        "manufacturer: " + manufacturer + "" + "\n" +
        "chassi: " + chassi + "" + "\n" + 
        "plate: " + plate + "" + "\n" +
        "year: " + year + "" + "\n"; 

     }
}
