public class Operadores {
    public float adicao(float a, float b) {
        return a + b;
    }

    public float subtracao(float a, float b) {
        return a - b;
    }

    public float multiplicacao(float a, float b) {
        return a * b;
    }

    public float divisao(float a, float b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    public float resto(float a, float b) {
        return a % b;
    }

    public double atribuir(double valor) {
        return valor;
    }

    public double somarEAtribuir(double a, double b) {
        a += b;
        return a;
    }

    public double subtrairEAtribuir(double a, double b) {
        a -= b;
        return a;
    }

    public double multiplicarEAtribuir(double a, double b) {
        a *= b;
        return a;
    }

    public double dividirEAtribuir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return a;
        }
        a /= b;
        return a;
    }

    public double restoEAtribuir(double a, double b) {
        a %= b;
        return a;
    }

    public boolean ehMaior(double v1, double v2) {
        return v1 > v2;
    }

    public boolean ehMenor(double v1, double v2) {
        return v1 < v2;
    }

    public boolean ehIgual(double v1, double v2) {
        return v1 == v2;
    }

    public boolean ehDiferente(double v1, double v2) {
        return v1 != v2;
    }

    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a, boolean b) {
        return !a;
    }
}
