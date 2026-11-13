
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CADASTRO DE ALUNO ===");

        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.print("Digite a matricula: ");
        String matricula = entrada.nextLine();

        System.out.print("Digite o curso: ");
        String curso = entrada.nextLine();

        // Criando o objeto
        Aluno aluno = new Aluno(
                nome, idade, matricula, curso
        );

        // Exibindo os dados
        System.out.println("\n=== DADOS DO ALUNO ===");
        aluno.exibirDados();

        entrada.close();
    }
}
