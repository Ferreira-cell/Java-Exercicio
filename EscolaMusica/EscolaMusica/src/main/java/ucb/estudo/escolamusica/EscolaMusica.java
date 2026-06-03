package ucb.estudo.escolamusica;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaMusica {
    
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciar a Orquestra");
        
        InstrumentoMusical[] banda = new InstrumentoMusical[8];
        
        banda[0] = new ViolaoExercicio("Violão Clássico", "Madeira", 6);
        banda[1] = new PianoExercicio("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new BateriaExercicio("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new SaxofoneExercicio("Saxofone", "Latão", "Alto");
        
        banda[4] = new FlautaExercicio("Flauta Transversal", "Prata", "Circular");
        banda[5] = new ViolinoExercicio("Violino Stradivarius", "Abeto", "Crina de Cavalo");
        banda[6] = new TrompeteExercicio("Trompete Yamaha", "Latão Dourado", 3);
        banda[7] = new BaixoExercicio("Baixo Fender", "Alder", true);
        
        EscolaMusica escola = new EscolaMusica();
        
        escola.apresentar(banda);
        
        escola.contarInstrumentosPorTipo(banda);
   }
    
    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("=== A ORQUESTRA VAI COMEÇAR! ===\n");
        
        System.out.println("--- Afinação dos Instrumentos ---");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }
        System.out.println();
                
        System.out.println(" ---- Instrumentos começaram a tocar ---- ");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
        System.out.println();
        
        System.out.println(" ----- Mostrando informações dos Instrumentos ---- ");
        for (int i = 0; i < banda.length; i++) {
            System.out.println("Instrumento musical " + (i + 1) + " : ");
            banda[i].mostrarInformacoes();
            System.out.println();
        }
    }
    
    public void contarInstrumentosPorTipo(InstrumentoMusical[] instrumentos) {
    System.out.println("\n=== ESTATÍSTICAS DA ORQUESTRA ===");
    
    int violoes = 0, pianos = 0, baterias = 0, saxofones = 0;
    int flautas = 0, violinos = 0, trompetes = 0, baixos = 0;
    
    for (InstrumentoMusical instrumento : instrumentos) {
        if (instrumento instanceof ViolaoExercicio) {
            violoes++;
        } else if (instrumento instanceof PianoExercicio) {
            pianos++;
        } else if (instrumento instanceof BateriaExercicio) {
            baterias++;
        } else if (instrumento instanceof SaxofoneExercicio) {
            saxofones++;
        } else if (instrumento instanceof FlautaExercicio) {
            flautas++;
        } else if (instrumento instanceof ViolinoExercicio) {
            violinos++;
        } else if (instrumento instanceof TrompeteExercicio) {
            trompetes++;
        } else if (instrumento instanceof BaixoExercicio) {
            baixos++;
        }
    }
    
    System.out.println("Total de instrumentos: " + instrumentos.length);
    System.out.println("Violões: " + violoes);
    System.out.println("Pianos: " + pianos);
    System.out.println("Baterias: " + baterias);
    System.out.println("Saxofones: " + saxofones);
    System.out.println("Flautas: " + flautas);
    System.out.println("Violinos: " + violinos);
    System.out.println("Trompetes: " + trompetes);
    System.out.println("Baixos: " + baixos);
}
}
    