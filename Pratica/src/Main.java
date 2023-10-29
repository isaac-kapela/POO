import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = Integer.parseInt(leia.nextLine());

        System.out.println("Sua idade é: " + idade);

        if( idade >= 5 && idade <= 7 ){
            System.out.println("A sua categoria é" + "\n" + " ● Infantil A");
        } else if (idade >= 8 &&  idade<= 10) {
            System.out.println( "A sua categoria é"+"\n"+"● Infantil B");
        }
        else if(idade >= 11 && idade <= 13){
            System.out.println("A sua categoria é" + "\n" + "● Juvenil A" );
        }
        else if(idade >= 14 && idade <= 17){
            System.out.println("A sua categoria é"+ "\n" + "● Juvenil B");
        }
      else if(idade > 18){
          System.out.println("A sua categoria é :" + "\n" + "● Adulto");
        }

      else{
          System.out.println("Dados inavlidos");
        }
    }


}
