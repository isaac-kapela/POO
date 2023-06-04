import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeHabitantes;
        int quantidadeFilhos;
        int contador = 0;
        int salario;
        double somtorioSalario = 0;
        double somaFilhos = 0;
        double maiorSalario = 0;

        System.out.println(" Quantas pessoas irão participar da pesquisa:");
        quantidadeHabitantes = scanner.nextInt();

        while (contador < quantidadeHabitantes) {
            System.out.println(" qual o seu salario: ");
            salario = scanner.nextInt();


            System.out.println( " Quantos filhos você tem:  ");
            quantidadeFilhos = scanner.nextInt();

            somaFilhos = somaFilhos + quantidadeFilhos;
            
            if(salario > maiorSalario) {
                maiorSalario = salario;
            }
            somtorioSalario = somtorioSalario + maiorSalario;
            contador++;

        }
        double mediaSalarial = somtorioSalario / quantidadeHabitantes;
        double mediaFilhos = somaFilhos / quantidadeHabitantes;
        System.out.println("A média salarial da cidade é: " + mediaSalarial );
        System.out.println("A média de filhos por habitante é: " + mediaFilhos);
        System.out.println("O maior salário é: " + maiorSalario);
    }
}