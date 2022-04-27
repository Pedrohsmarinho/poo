public class Section {

    private String nome;
    private float tempo;
    private float custo;


    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo= tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
    @Override
    public String toString() {
      return "Nome: "+nome+ "" +
              "\n"+ "Tempo: "+tempo+"" +
                  "\n"+"Custo: "+custo+"" + "\n";
    }
}
