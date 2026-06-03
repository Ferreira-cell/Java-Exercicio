package ucb.estudo.escolamusica;

public class FlautaExercicio extends InstrumentoMusical {
    private String tipoEmbocadura;

    public FlautaExercicio(String nome, String material, String tipoEmbocadura) {
        super(nome, material);
        this.tipoEmbocadura = tipoEmbocadura;
    }

    @Override
    public void tocar() {
        System.out.println("Soprando suavemente na " + nome + " (" + tipoEmbocadura + ")");
        System.out.println("Tuuu... Fiii... Tuuu...");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando a posição do bocal da flauta.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de embocadura: " + tipoEmbocadura);
    }
}
