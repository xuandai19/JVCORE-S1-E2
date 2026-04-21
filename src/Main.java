import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất (firstNumber): ");
        int n1 = sc.nextInt();
        System.out.print("Nhập số thứ hai (secondNumber): ");
        int n2 = sc.nextInt();

        System.out.print("\n--- Kết quả ---\n");
        System.out.printf("firstNumber = %d\n", n1);
        System.out.printf("secondNumber = %d\n", n2);
        System.out.printf("Tổng = %d\n", n1 + n2);
        System.out.printf("Hiệu = %d\n", n1 - n2);
        System.out.printf("Tích = %d\n", n1 * n2);
        System.out.printf("Thương = %d\n", n1 / n2);
        System.out.printf("Phần dư = %d\n", n1 % n2);
    }
}
