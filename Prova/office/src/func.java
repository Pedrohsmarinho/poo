public class func {
    private String nome;
    private Integer cpf;
    private String endereco;

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf= cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    @Override
    public String toString() {
      return "Cpf: "+cpf+ "" +
              "\n"+ "Nome: "+nome+"" +
                  "\n"+"Endereço: "+endereco+"" + "\n";
    }
}
