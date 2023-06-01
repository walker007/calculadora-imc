import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à calculadora de IMC\nAntes de Começar, Forneça algumas informações");

        System.out.print("Nome: ");
        pessoa.setNome(scan.nextLine());

        System.out.print("Idade: ");
        pessoa.setIdade(scan.nextInt());

        System.out.print("Altura: ");
        pessoa.setAltura(scan.nextDouble());

        System.out.print("Peso: ");
        pessoa.setPeso(scan.nextDouble());

        System.out.println("Ok, Estou executando os Cálculos");
        pessoa.calculaImc();

        System.out.println("O IMC de "+pessoa.getNome() +" com "+pessoa.getIdade()+" anos é: " + pessoa.getImc());
        System.out.println(pessoa.classificaIMC());
    }
}