import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        wyjatki Wyjatki =  new wyjatki();
        try{
            Wyjatki.metoda1();
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        try{
            double liczba = scanner.nextDouble();
            if (liczba<0){
                throw new IllegalAccessException("Podaj liczbe (Musi byc >0");
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("nu nu nu");
        }

    }
}