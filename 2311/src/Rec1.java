import java.util.Scanner;

public class Rec1 {
    static Scanner sc = new Scanner(System.in);
    static int Summ() {
        int a = sc.nextInt();
        if (a == 0) {
            return 0;
        }
        return a + Summ();
    }
    public static void main(String[] args) {
        System.out.println(Summ());
    }
}
