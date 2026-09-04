public class Aluno {
    private String nome;
    private String ra;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String ra, double nota1, double nota2) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 5.0;
    }

    public String obterSituacao() {
        if (estaAprovado()) {
            return "Aprovado";
        }

        return "Reprovado";
    }

    public void exibirDados() {
        System.out.println("------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.printf("Nota 1: %.2f%n", nota1);
        System.out.printf("Nota 2: %.2f%n", nota2);
        System.out.printf("Média: %.2f%n", calcularMedia());
        System.out.println("Situação: " + obterSituacao());
    }
}