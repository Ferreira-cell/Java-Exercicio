package ucb.estudo.escolamusica; 

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;
    
    //Construtor
    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }
    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void tocar(); 

    // Dois Métodos concretos que pode ser usado por todas as subclasses
    public void afinar() {
        System.out.println("Afinando o " + nome + "...");
    }

    public void mostrarInformacoes() {
        System.out.println("Instrumento: " + nome);
        System.out.println("Material: " + material);
    }

    // Getters
    public String getNome() { return nome; }
    public String getMaterial() { return material; }
}
