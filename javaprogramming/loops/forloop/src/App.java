import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enter a number!");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("you entered "+k+"lemme great you "+k+" times");
        for(int i=0;i<k;i++){
            System.out.println("hi boy");
        }
    }
}
