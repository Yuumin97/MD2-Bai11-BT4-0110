
import java.util.Scanner;
import java.util.Stack;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap phan so thap phan :");
        int number = scanner.nextInt();
        while (number != 0){
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }
        System.out.println("Gia tri nhi phan la: ");
        while (!(stack.isEmpty())){
            System.out.println(stack.pop());
        }
    }
}
