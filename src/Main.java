import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;

        System.out.print("bán kính : ");
        float k1 = sc.nextFloat();
        System.out.printf("Diện tích : %.2f", PI * k1 * k1);
    }
}