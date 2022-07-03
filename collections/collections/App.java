import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Cars a1 = new Cars("Argo", "Fiat", 2014, 50.0);

        ArrayList<Cars> car = new ArrayList<Cars>();
        car.add(a1);
        
        Func organizar = new Func("milton", "989201422", "129786");

        organizar.adiciona(new Cars("Argo", "Fiat", 2015, 50.00));
        organizar.adiciona(new Cars("Onix", "Chevy", 2019, 56.00));

        organizar.adiciona(new Clients("Pedro Marinho", "joaquim figueira galvão", "703.791.544.04", 989571522,
                "pedrohsmarinho@otlook.com"));
        organizar.adiciona(new Clients("Carlos Monteiro", "Aurora Trend", "804.923.471.03",
        967431599, "carlo.monteiro@otlook.com"));

        System.out.println(organizar.getCar());
        System.out.println(organizar.getClient());
    }
}
