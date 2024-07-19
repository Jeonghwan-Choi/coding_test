import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long A;

        A = Long.parseLong(sc.next());

        if(A >= 90 && A <= 100) {
            System.out.println("A");
        }else if(A >= 80 && A <= 89) {
            System.out.println("B");
        }if(A >= 70 && A <= 79) {
            System.out.println("C");
        }if(A >= 60 && A <= 69) {
            System.out.println("D");
        }else if(A < 60) {
            System.out.println("F");
        }
    }

}
