public class App {
    public static void main(String[] args) throws Exception {
        try {
            int myNumbers[] = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ponteiro fora dos limites do array!");
        } finally {
            System.out.println("Try Catch finalizado!");
        }
    }
}