public class Calculadora {
    public static void main(String[] args) {
        Operadores op = new Operadores();

        float a = 10;
        float b = 5;

        System.out.println("Subtração: " + op.subtracao(a, b));
        System.out.println("Multiplicação: " + op.multiplicacao(a, b));
        System.out.println("Divisão: " + op.divisao(a, b));
        System.out.println("Resto: " + op.resto(a, b));

        System.out.println("Atribuição: " + op.atribuir(7));
        System.out.println("Somar e atribuir: " + op.somarEAtribuir(a, b));
        System.out.println("Subtrair e atribuir: " + op.subtrairEAtribuir(a, b));
        System.out.println("Multiplicar e atribuir: " + op.multiplicarEAtribuir(a, b));
        System.out.println("Dividir e atribuir: " + op.dividirEAtribuir(a, b));
        System.out.println("Resto e atribuir: " + op.restoEAtribuir(a, b));

        System.out.println("Maior que: " + op.ehMaior(a, b));
        System.out.println("Menor que: " + op.ehMenor(a, b));
        System.out.println("Igual: " + op.ehIgual(a, b));
        System.out.println("Diferente: " + op.ehDiferente(a, b));

        System.out.println("E lógico: " + op.eLogico(true, false));
        System.out.println("OU lógico: " + op.ouLogico(true, false));
        System.out.println("NÃO lógico: " + op.naoLogico(true, false));
    }
}
