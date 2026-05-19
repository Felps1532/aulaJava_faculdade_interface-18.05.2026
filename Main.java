import java.io.IOException;

public class Main {
    public void m() throws IOException {
        throw new IOException("Erro de dispositivo!"); // como o método gera uma exceção, coloque dentro do Try Catch
    }

    public static void main(String[] args) {
        try {
            Main obj = new Main();
            obj.m();
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
        }
    }
}
