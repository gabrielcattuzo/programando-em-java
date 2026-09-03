import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner, alunos);
                    break;

                case 2:
                    listarAlunos(alunos);
                    break;

                case 3:
                    buscarAluno(scanner, alunos);
                    break;

                case 4:
                    removerAluno(scanner, alunos);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n===== CADASTRO DE ALUNOS =====");
        System.out.println("1 - Cadastrar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Buscar aluno pelo RA");
        System.out.println("4 - Remover aluno");
        System.out.println("0 - Encerrar");
    }

    public static void cadastrarAluno(
            Scanner scanner,
            ArrayList<Aluno> alunos) {

        System.out.println("\n===== CADASTRO =====");

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("RA do aluno: ");
        String ra = scanner.nextLine();

        if (encontrarAlunoPorRa(alunos, ra) != null) {
            System.out.println("Já existe um aluno com esse RA.");
            return;
        }

        double nota1 = lerNota(scanner, "Digite a primeira nota: ");
        double nota2 = lerNota(scanner, "Digite a segunda nota: ");

        Aluno novoAluno = new Aluno(nome, ra, nota1, nota2);
        alunos.add(novoAluno);

        System.out.println("Aluno cadastrado com sucesso!");
        System.out.printf("Média: %.2f%n", novoAluno.calcularMedia());
        System.out.println("Situação: " + novoAluno.obterSituacao());
    }

    public static void listarAlunos(ArrayList<Aluno> alunos) {
        System.out.println("\n===== ALUNOS CADASTRADOS =====");

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Aluno aluno : alunos) {
            aluno.exibirDados();
        }

        System.out.println("------------------------------");
        System.out.println("Total de alunos: " + alunos.size());
    }

    public static void buscarAluno(
            Scanner scanner,
            ArrayList<Aluno> alunos) {

        System.out.println("\n===== BUSCA DE ALUNO =====");

        System.out.print("Digite o RA do aluno: ");
        String ra = scanner.nextLine();

        Aluno alunoEncontrado = encontrarAlunoPorRa(alunos, ra);

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        alunoEncontrado.exibirDados();
    }

    public static void removerAluno(
            Scanner scanner,
            ArrayList<Aluno> alunos) {

        System.out.println("\n===== REMOÇÃO DE ALUNO =====");

        System.out.print("Digite o RA do aluno: ");
        String ra = scanner.nextLine();

        Aluno alunoEncontrado = encontrarAlunoPorRa(alunos, ra);

        if (alunoEncontrado == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        alunos.remove(alunoEncontrado);
        System.out.println("Aluno removido com sucesso!");
    }

    public static Aluno encontrarAlunoPorRa(
            ArrayList<Aluno> alunos,
            String ra) {

        for (Aluno aluno : alunos) {
            if (aluno.getRa().equalsIgnoreCase(ra)) {
                return aluno;
            }
        }

        return null;
    }

    public static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException erro) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    public static double lerNota(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            String entrada = scanner.nextLine().replace(",", ".");

            try {
                double nota = Double.parseDouble(entrada);

                if (nota >= 0 && nota <= 10) {
                    return nota;
                }

                System.out.println("A nota deve estar entre 0 e 10.");
            } catch (NumberFormatException erro) {
                System.out.println("Digite uma nota válida.");
            }
        }
    }
}