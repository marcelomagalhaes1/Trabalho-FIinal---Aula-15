class ExpressaoOr implements Expressao {
    private final Expressao expressao1;
    private final Expressao expressao2;

    public ExpressaoOr(Expressao expressao1, Expressao expressao2) {
        this.expressao1 = expressao1;
        this.expressao2 = expressao2;
    }

    @Override
    public boolean interpretar() {
        return expressao1.interpretar() || expressao2.interpretar();
    }
}