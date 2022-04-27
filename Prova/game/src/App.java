import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("## Choose your character ##");
            System.out.println("Option 1- Play with humans");
            System.out.println("Option 2- Play with aliens");
            System.out.println("Option 3- Play with Robots");
            System.out.println("Opção 0 - Exit");
            System.out.println("_______________________");

            System.out.print("enter your option: ");

            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                
                Humans h1 = new Humans();

                System.out.println("Nationality of human: ");
                h1.setNationality(sc.nextLine());
                System.out.println("Human skin color: ");
                h1.setSkin(sc.nextLine());
                System.out.println("Human gender: ");
                h1.setGender(sc.nextLine());
                System.out.println();
                System.out.println("By default all human weapons are pistol, power 4 with 30 shots");
                System.out.println("Do you want change the human weapon?");

                int ophuman = 0;

                System.out.println("## Choose your option ##");
                System.out.println("Option 1- yes");
                System.out.println("Option 2- no");
                System.out.println("_______________________");
                System.out.print("enter your option: ");

                ophuman = Integer.parseInt(sc.nextLine());

                if (ophuman == 1) {

                    Guns g1 = new Guns();

                    System.out.println("Type of the weapon ");
                    g1.setType(sc.nextLine());
                    System.out.println("Power of the weapon");
                    g1.setPower(sc.nextInt());
                    System.out.println("Capacity of the weapon");
                    g1.setCapacity(sc.nextInt());
                    
                    System.out.println();

                    System.out.println("\n========================================\n");
                    System.out.println("Nacionality: " + h1.getNationality());
                    System.out.println("Skin human color: " + h1.getSkin());
                    System.out.println("Human Gender: " + h1.getGender());
                    System.out.println("Type weapon: " + g1.getType());
                    System.out.println("Capacity weapon: " + g1.getCapacity());
                    System.out.println("Power of weapon: " + g1.getPower()) ;
                    System.out.println("\n========================================\n");
                
                    sc.close();
                }

                else {

                    System.out.println("\n========================================\n");
                    System.out.println("Nacionality: " + h1.getNationality());
                    System.out.println("Skin human color: " + h1.getSkin());
                    System.out.println("Human Gender: " + h1.getGender());
                    System.out.println("Type weapon: pistol ");
                    System.out.println("Capacity: 30 ");
                    System.out.println("Power: 3 ");
                    System.out.println("\n========================================\n");
                }
            } 
            else if (opcao == 2) {
                
                Aliens a1 = new Aliens();

                System.out.println("Planet of Alien: ");
                a1.setPlanet(sc.nextLine());
                System.out.println("Breed of the alien: ");
                a1.setBreed(sc.nextLine());
                System.out.println();
                System.out.println("By default all alien weapons are laser cannon, power 7 with 2 shots");
                System.out.println("Do you want change the alien weapon?");

                int opalien = 0;

                System.out.println("## Choose your option ##");
                System.out.println("Option 1- yes");
                System.out.println("Option 2- no");
                System.out.println("_______________________");
                System.out.print("enter your option: ");
                opalien = Integer.parseInt(sc.nextLine());

                if (opalien == 1) {

                    Guns g1 = new Guns();

                    System.out.println("Type of the weapon ");
                    g1.setType(sc.nextLine());
                    System.out.println("Power of the weapon");
                    g1.setPower(sc.nextInt());
                    System.out.println("Capacity of the weapon");
                    g1.setCapacity(sc.nextInt());
                    

                    System.out.println("\n========================================\n");
                    System.out.println("Planet : " + a1.getPlanet());
                    System.out.println("Breed: " + a1.getBreed()); 
                    System.out.println("Type weapon: " + g1.getType());
                    System.out.println("Capacity weapon: " + g1.getCapacity());
                    System.out.println("Power of weapon: " + g1.getPower()) ;
                    System.out.println("\n========================================\n");

                    sc.close();
                }

                else {
                    System.out.println("\n========================================\n");
                    System.out.println("Planet : " + a1.getPlanet());
                    System.out.println("Breed: " + a1.getBreed());
                    System.out.println("alien weapon: laser cannon");
                    System.out.println("Capacity: 2");
                    System.out.println("Power: 7");
                    System.out.println("\n========================================\n");

                }
            } else if (opcao == 3) {

                Robots r1 = new Robots();

                System.out.println("manufacturer of the robot: ");
                r1.setManufacturer(sc.nextLine());
                System.out.println();
                System.out.println("Model of robot: ");
                r1.setModel(sc.nextInt());
                System.out.println("By default all Robot was no weapons");
                System.out.println("Do you want add a robot weapon?");

                int oprobot = 0;

                System.out.println("## Choose your option ##");
                System.out.println("Option 1- yes");
                System.out.println("Option 2- no");
                System.out.println("_______________________");
                System.out.print("enter your option: ");

                oprobot = Integer.parseInt(sc.nextLine());

                if (oprobot == 1) {

                    Guns g1 = new Guns();

                    System.out.println("Type of the weapon ");
                    g1.setType(sc.nextLine());
                    System.out.println("Power of the weapon");
                    g1.setPower(sc.nextInt());
                    System.out.println("Capacity of the weapon");
                    g1.setCapacity(sc.nextInt());
                    
                    System.out.println("\n========================================\n");
                    System.out.println("Model : " + r1.getModel());
                    System.out.println("Manufacturer: " + r1.getManufacturer());
                    System.out.println("Type weapon: " + g1.getType());
                    System.out.println("Capacity weapon: " + g1.getCapacity());
                    System.out.println("Power of weapon: " + g1.getPower()) ;
                    System.out.println("\n========================================\n");

                    sc.close();

                } else {
                    System.out.println("\n========================================\n");
                    System.out.println("Model : " + r1.getModel());
                    System.out.println("Manufacturer: " + r1.getManufacturer());
                    System.out.println("\n========================================\n");
                }

            }
        }

        while (opcao != 0);

        sc.close();
    }
}
