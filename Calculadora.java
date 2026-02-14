/*
 * Nombre: Starlyn Eduardo Escalante
 * Matrícula: 2025-1089
 * Tarea 2.2 - Sobrecarga de Métodos
 */
public class Calculadora {

    // operaciones basicas
    public int sumar(int n1, int n2) {
        return n1 + n2;
    }

    public int restar(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    public int dividir(int n1, int n2) {
        return n1 / n2;
    }

    // sobrecarga para 3 enteros
    public int sumar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int restar(int n1, int n2, int n3) {
        return n1 - n2 - n3;
    }

    public int multiplicar(int n1, int n2, int n3) {
        return n1 * n2 * n3;
    }

    // sobrecarga para 4 enteros
    public int sumar(int n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    public int restar(int n1, int n2, int n3, int n4) {
        return n1 - n2 - n3 - n4;
    }

    public int multiplicar(int n1, int n2, int n3, int n4) {
        return n1 * n2 * n3 * n4;
    }
}
