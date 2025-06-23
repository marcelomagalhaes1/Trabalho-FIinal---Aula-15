public interface Dispositivo {
    boolean estaLigado();
    void ligar();
    void desligar();
    int obterVolume();
    void definirVolume(int percentual);
    int obterCanal();
    void definirCanal(int canal);
}
