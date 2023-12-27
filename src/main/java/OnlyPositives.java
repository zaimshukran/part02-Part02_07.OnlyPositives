
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            if(input<0){
                System.out.println("Unsuitable number");
                continue;
            }else if(input == 0){
                break;
            }else{
                System.out.println(Math.pow(input, 2));
            }
        }
    }
}
