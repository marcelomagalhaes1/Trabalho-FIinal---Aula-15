public class ControleRemoto {
    protected Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void alternarLigacao(){
        if(dispositivo.estaLigado()){
            dispositivo.desligar();
        }
        else{
            dispositivo.ligar();
        }
    }

    public void aumentarVolume() {
        dispositivo.definirVolume(dispositivo.obterVolume()+10);
    }

    public void diminuirVolume() {
        dispositivo.definirVolume(dispositivo.obterVolume()-10);
    }

    public void avancarCanal() {
        dispositivo.definirCanal(dispositivo.obterCanal() +1);
    }

    public void voltarCanal() {
        dispositivo.definirCanal(dispositivo.obterCanal() -1);
    }
}
