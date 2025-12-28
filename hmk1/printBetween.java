import java.util.Scanner;public class printBetween {

    public static void printRange(int a, int b) {
        int start;
        int end;

        if (a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }

        for (int i = start + 1; i < end; i++) {
		if(i%2==0){
			System.out.println(i);
		}            
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        printRange(first, second);
    }
}
