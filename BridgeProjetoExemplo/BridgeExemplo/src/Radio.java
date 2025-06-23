public class Radio implements Dispositivo {
    private boolean ligado = false;
    private int volume = 50;
    private int frequencia = 101;

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("rádio: ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("rádio: desligado");
    }

    @Override
    public int obterVolume() {
        return volume;
    }

    @Override
    public void definirVolume(int percentual) {
        volume = Math.max(0, Math.min(100, percentual));
        System.out.println("rádio: volume ajustado para "+volume+"%");
    }

    @Override
    public int obterCanal() {
        return frequencia;
    }

    @Override
    public void definirCanal(int canal) {
        frequencia = canal;
        System.out.println("rádio: frequência ajustada para "+canal);
    }
}
