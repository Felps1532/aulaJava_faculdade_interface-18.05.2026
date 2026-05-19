public class App {
    public static void main(String[] args) throws Exception {
        try {
            int myNumbers[] = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stacktrace: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Algo deu errado!");
            e.printStackTrace();
            System.out.println("Error: " + e.toString());
        } finally {
            System.out.println("Try Catch finalizado!");
        }
    }
}