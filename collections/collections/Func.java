import java.util.*;

public class Func {
    private String name;
    private int phone;
    private int register;
    private List<Cars> car = new LinkedList<Cars>();
    private List<Clients> client = new LinkedList<Clients>();

    Func(String name, int phone, int register) {
        this.name = name;
        this.phone = phone;
        this.register = register;
    }

    public Func(String name2, String string, String string2) {
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public int getRegister() {
        return register;
    }

    public List<Cars> getCar() {
        return car;
    }

    public void adiciona(Cars car) {
        this.car.add(car);
    }

    public List<Clients> getClient() {
        return client;
    }

    public void adiciona(Clients client) {
        this.client.add(client);
    }

    @Override
    public String toString() {
        return "[Func: " + this.name + ", " + this.register + "]";
    }
}
