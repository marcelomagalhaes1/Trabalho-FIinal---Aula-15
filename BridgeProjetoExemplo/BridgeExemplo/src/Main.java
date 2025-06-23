public class Main {
    public static void main(String[] args) {
        System.out.println("=== teste com televisão ===");
        Dispositivo tv = new Televisao();
        ControleRemoto controle = new ControleAvancado(tv);
        controle.alternarLigacao();
        controle.aumentarVolume();
        controle.avancarCanal();
        ((ControleAvancado) controle).silenciar();
        controle.alternarLigacao();

        System.out.println("\n=== teste com rádio ===");
        Dispositivo radio = new Radio();
        ControleRemoto controleBasico = new ControleRemoto(radio);
        controleBasico.alternarLigacao();
        controleBasico.diminuirVolume();
        controleBasico.avancarCanal();
        controleBasico.alternarLigacao();
    }
}
