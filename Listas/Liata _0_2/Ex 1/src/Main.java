import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade = Integer.parseInt(leia.nextLine());

        System.out.println("a sua idade é:  " + leia);

        if (idade >= 5 && idade <= 7) {
            System.out.println(" categoria é infatil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println(" A categoria é infantil B");

        } else if (idade >= 11 && idade <= 13) {
            System.out.println(" A categoria é Juvenil A");

        } else if (idade >= 14 && idade <= 17) {
            System.out.println(" A categoria é Juvenil B");
        } else if (idade >= 18) {
            System.out.println(" A categoria é Adulta");

        }
    }
}