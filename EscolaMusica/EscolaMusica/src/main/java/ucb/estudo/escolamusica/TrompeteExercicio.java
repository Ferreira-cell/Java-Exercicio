package ucb.estudo.escolamusica;


public class TrompeteExercicio extends InstrumentoMusical {
    private int quantidadePistoes;

    public TrompeteExercicio(String nome, String material, int quantidadePistoes) {
        super(nome, material);
        this.quantidadePistoes = quantidadePistoes;
    }

    @Override
    public void tocar() {
        System.out.println("Pressionando os " + quantidadePistoes + " pistões do " + nome);
        System.out.println("Pa-pa-pa-paaaa!");
    }

    @Override
    public void afinar() {
        System.out.println("Movendo a pompa de afinação principal do trompete.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Quantidade de pistões: " + quantidadePistoes);
    }
}