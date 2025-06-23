class ExpressaoBooleana implements Expressao {
    private final boolean valor;

    public ExpressaoBooleana(boolean valor) {
        this.valor = valor;
    }

    @Override
    public boolean interpretar() {
        return valor;
    }
}