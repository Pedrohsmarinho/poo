public class PassengerVehicle extends Vehicle {
    private String ar;
    private int doors;

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String Ar(){
        return ar;
    }
    public void setAr(String ar){
        this.ar = ar;
    }

    @Override
    public String toString(){
        return 

        "ar: " + ar + "" + "\n" +
        "doors: " + doors + "" + "\n"; 
    }

}
