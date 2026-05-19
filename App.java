import java.io.IOException;

public class App {

    public void m() throws IOException {
        throw new IOException("IOException lançada!");
    }

    public static void main(String[] args) throws Exception {
        try {
            App app = new App();
            app.m();
            // int myNumbers[] = { 1, 2, 3 };
            // System.out.println(myNumbers[10]);
        } catch (IOException e) {
            System.out.println("IOexception!\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Algo deu errado!");
            e.printStackTrace();
            System.out.println("Error: " + e.toString());
        } finally {
            System.out.println("Try Catch finalizado!");
        }
    }
}