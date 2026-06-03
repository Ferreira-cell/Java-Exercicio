package ucb.estudo.escolamusica;


public class BaixoExercicio extends InstrumentoMusical {
    private boolean ativo; // Se o captador é ativo ou passivo

    public BaixoExercicio(String nome, String material, boolean ativo) {
        super(nome, material);
        this.ativo = ativo;
    }

    @Override
    public void tocar() {
        String tipo = ativo ? "Ativo" : "Passivo";
        System.out.println("Groove pesado no " + nome + " (" + tipo + ")");
        System.out.println("Dum... Dum... Bass...");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando a tensão das cordas grossas do baixo.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Circuito Ativo: " + (ativo ? "Sim" : "Não"));
    }
}
