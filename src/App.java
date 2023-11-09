import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        input.close();

        String star = "*";
        String empty = " ";

        for (int i = 0; i < number; i++){
            for (int j = (number-i); j > 0; j--){
                System.out.print(empty);
            }
            System.out.println(empty + star + empty );
            star += "**";
        }
    }
}
