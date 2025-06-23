public class Televisao implements Dispositivo {
    private boolean ligado = false;
    private int volume = 30;
    private int canal = 1;

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("televisão: ligada");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("televisão: desligada");
    }

    @Override
    public int obterVolume() {
        return volume;
    }

    @Override
    public void definirVolume(int percentual) {
        volume = Math.max(0, Math.min(100, percentual));
        System.out.println("Televisão: volume ajustado para "+volume+"%");
    }

    @Override
    public int obterCanal() {
        return canal;
    }

    @Override
    public void definirCanal(int canal) {
        this.canal = canal;
        System.out.println("televisão: canal ajustado para "+canal);
    }
}
