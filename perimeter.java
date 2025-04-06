import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        float width;
        float height;
        float perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter is: width ");
        width = scanner.nextFloat();
        System.out.println("Enter is: height ");
        height = scanner.nextFloat();
        perimeter = 2 * (width + height);
        System.out.println("Perimeter is: " + perimeter);
    }
}
