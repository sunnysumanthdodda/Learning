import java.util.Scanner;

public class Planet {

    private void revolve() {
        System.out.println("Revolve");
    }

    private void comingSoon() {
        System.out.println("Coming Soon");
    }

    private void interstellar(){
        System.out.println("Movie directed by Christopher Nolan");
    }

    private void training(){
        System.out.println("Java Training is mandatory");
    }

    public static int number(int n) {
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planet earth = new Planet();
        earth.revolve();
        earth.comingSoon();
        earth.interstellar();
        earth.training();
        System.out.print("Enter the desired number: ");
        int n = sc.nextInt();
        System.out.println(number(n));
        System.out.println(number(n*n));
        sc.close();
    }
}