/*
 * Nombre: Starlyn Eduardo Escalante
 * Matrícula: 2025-1089
 * Tarea 2.2 - Sobrecarga de Métodos
 */
public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        // Probar metodos de 2 params
        System.out.println("Suma 2: " + c.sumar(5, 3));
        System.out.println("Resta 2: " + c.restar(10, 4));
        System.out.println("Multi 2: " + c.multiplicar(6, 7));
        System.out.println("Div 2: " + c.dividir(20, 4));

        // Probar metodos de 3 params
        System.out.println("Suma 3: " + c.sumar(5, 3, 2));
        System.out.println("Resta 3: " + c.restar(10, 4, 2));
        System.out.println("Multi 3: " + c.multiplicar(2, 3, 4));

        // Probar metodos de 4 params
        System.out.println("Suma 4: " + c.sumar(1, 2, 3, 4));
        System.out.println("Resta 4: " + c.restar(20, 5, 3, 2));
        System.out.println("Multi 4: " + c.multiplicar(2, 2, 2, 2));
    }
}
