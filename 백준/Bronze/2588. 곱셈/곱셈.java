import java.util.Scanner;


class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A;
        String B;

        A = sc.nextInt();
        B = sc.next();

        for (int i = B.length() - 1; i >= 0; i--) {

            String numberStr = B;
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            System.out.println(digit *  A);
        }
        System.out.println(A * Integer.valueOf(B));
    }

}