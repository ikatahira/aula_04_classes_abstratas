public abstract class Animal{

    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public abstract String emitirSom();
     

}