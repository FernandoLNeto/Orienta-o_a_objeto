public class Pessoa {

    private String nome;
    private int idade = 0;
    private int telefone = 0;

    public void lerNome() {
        this.nome = "Fernando";
        System.out.println(nome);
    }

    public void lerIdade() {
        this.idade = 31;
        System.out.println(idade);
    }
    
    public void lerTelefone() {
        this.telefone = 123456789;
        System.out.println(telefone);
    }
}