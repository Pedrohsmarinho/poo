public class Clients {

    private String name;
    private String address;
    private int phone;
    private String cpf;
    private String email;

    Clients(String name, String address, String cpf, int phone, String email) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public int getPhone(){
        return phone;
    }
    public String getCpf(){
        return cpf;
    }

    @Override 
    public String toString() {
        return "[Client: " + this.name + ", " + this.phone + "]";
    }
}
