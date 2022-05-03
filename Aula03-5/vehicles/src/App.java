public class App {
    public static void main(String[] args) throws Exception {

                Vehicle v1 = new Vehicle();
            
                System.out.println("Model: ");
                v1.setModel("Argo");
                System.out.println("Manufacturer: ");
                v1.setManufacturer("fiat");
                System.out.println("Plate: ");
                v1.setPlate("12ksv21");
                System.out.println("Chassi: ");
                v1.setChassi("122jhjal");
                System.out.println("year: ");
                v1.setYear(2017);
            
                System.out.println("\n========================================\n");
                System.out.println("Model: " + v1.getModel());
                System.out.println("Manufacturer: " + v1.getManufacturer());
                System.out.println("Plate: " + v1.getPlate());
                System.out.println("Chass i: " + v1.getChassi());
                System.out.println("Year: " + v1.getYear());
                System.out.println("\n========================================\n");

            

          
                CargoVehicle cv = new CargoVehicle();            

                System.out.println("Model: ");
                cv.setModel("FH-120");
                System.out.println("Manufacturer: ");
                cv.setManufacturer("Volvo");
                System.out.println("Plate: ");
                cv.setPlate("8AB32S");
                System.out.println("Chassi: ");
                cv.setChassi("LO2ps12");
                System.out.println("year: ");
                cv.setYear(2020);
                System.out.println("cargo weight: ");
                cv.setCargo(120);

                System.out.println();

                System.out.println("\n========================================\n");
                System.out.println("Model: " + cv.getModel());
                System.out.println("Manufacturer: " + cv.getManufacturer());
                System.out.println("Plate: " + cv.getPlate());
                System.out.println("Chass i: " + cv.getChassi());
                System.out.println("Year: " + cv.getYear());
                System.out.println("Cargo wight: " + cv.getCargo() + "Kg");
                System.out.println("\n========================================\n");

           

          
                PassengerVehicle pv = new PassengerVehicle();

                System.out.println("Model: ");
                pv.setModel("Corsa");
                System.out.println("Manufacturer: ");
                pv.setManufacturer("GM");
                System.out.println("Plate: ");
                pv.setPlate("KGS21BS");
                System.out.println("Chassi: ");
                pv.setChassi("PA19BHN44");
                System.out.println("year: ");
                pv.setYear(2014);
                System.out.println("air conditioning: ");
                pv.setAr("yes");
                System.out.println("number of doors: ");
                pv.setDoors(4);

                System.out.println();

                System.out.println("\n========================================\n");
                System.out.println("Model: " + pv.getModel());
                System.out.println("Manufacturer: " + pv.getManufacturer());
                System.out.println("Plate: " + pv.getPlate());
                System.out.println("Chass i: " + pv.getChassi());
                System.out.println("Year: " + pv.getYear());               
                System.out.println("ar conditioning: " + pv.Ar());
                System.out.println("number of doors: " + pv.getDoors());
                System.out.println("\n========================================\n");
         
    }         
}
