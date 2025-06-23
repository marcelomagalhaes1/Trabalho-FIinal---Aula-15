public class ControleAvancado extends ControleRemoto {
    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void silenciar() {
        dispositivo.definirVolume(0);
        System.out.println("dispositivo silenciado");
    }
}
