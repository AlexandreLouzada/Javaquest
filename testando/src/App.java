public class App {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30 };
        int b = 0;
        try {
            System.out.println("1");
            int c = (array[3] / b);
            System.out.println("2");
        } catch (ArithmeticException ex) {
            System.out.println("Exceção Aritmética");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Índice de matriz fora dos limites");
        }
    }
}
