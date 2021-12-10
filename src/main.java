import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nome;
        double altura;
        int peso;
        System.out.print("informe o nome :");
        nome = scn.next();
        System.out.print(" informe a altura:");
        altura = scn.nextDouble();
        System.out.print(" informe peso:");
        peso = scn.nextInt();


        double resultado = peso / Math.pow(altura, 2);

        if (resultado < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (resultado > 18.5 && resultado < 24.9) {
            System.out.println("Peso Normal");
        } else if (resultado > 25 && resultado < 29.9) {
            System.out.println("sobre peso");
        } else if (resultado > 30 && resultado < 34.9) {
            System.out.println("obesidade grauI");
        } else if (resultado > 35 && resultado < 39.9) {
            System.out.println("Obesidade grau II");
        } else if ( resultado >= 40) {
            System.out.println("Obesidade grau III ou Morbida");
        }


    }

}
