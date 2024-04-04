import java.io.IOException;

public class wyjatki {
    public void metoda1() throws IOException {
        System.out.println("metoda 1");
        metoda2();
    }
    public void metoda2() throws IOException {
        System.out.println("metoda 2");
        metoda3();
    }
    public void metoda3() throws IOException {
        metoda4();
        System.out.println("metoda 3");
    }
    public void metoda4() throws IOException {
        System.out.println("metoda 4");
        throw new IOException("Bum bum ");
    }
}
