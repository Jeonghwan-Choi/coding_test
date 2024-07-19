import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long A;

        A = Long.parseLong(sc.next());

        if(A%4==0) {
            if(A%100!=0 || A%400==0) {
                System.out.println("1");
            }else {
                System.out.println("0");
            }
        }else {
                System.out.println("0");
        }

    }
}
