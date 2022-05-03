public class CargoVehicle extends Vehicle {
  
    private float cargo;

    public float getCargo() {
        return cargo;
    }

    public void setCargo(float cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString(){
        return 

        "cargo: " + cargo + "" + "\n"; 

    }

}
