public class Main {
    public static void main(String[] args) {
        Expressao verdadeiro = new ExpressaoBooleana(true);
        Expressao falso = new ExpressaoBooleana(false);

        Expressao expressaoE = new ExpressaoAnd(verdadeiro, falso);
        Expressao expressaoOU = new ExpressaoOr(verdadeiro, falso);

        System.out.println("true E false: " + expressaoE.interpretar());
        System.out.println("true OU false: " + expressaoOU.interpretar());
    }
}