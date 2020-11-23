import java.util.Scanner;

public class Rec {
    static Scanner sc = new Scanner(System.in);
    static int nod(int a, int b) {
        int r = a%b;
        if (r==0) {
            return b;
        }else{
            return (b, r);
        }
    }
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
    }
}
