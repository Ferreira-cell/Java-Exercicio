package ucb.estudo.escolamusica;

public class ViolinoExercicio extends InstrumentoMusical {
    private String tipoArco;

    public ViolinoExercicio(String nome, String material, String tipoArco) {
        super(nome, material);
        this.tipoArco = tipoArco;
    }

    @Override
    public void tocar() {
        System.out.println("Deslizando o arco " + tipoArco + " sobre as cordas do " + nome);
        System.out.println("Iéééé... Viiiin...");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando as cravelhas e micro-afinadores do violino.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Tipo de arco: " + tipoArco);
    }
}