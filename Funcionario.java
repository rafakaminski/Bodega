public class Funcionario {
    int codigo;
    String nome;
    int idade;
    int salario;


    // metodo construtor
    Funcionario(){}
    Funcionario(int codigo, String nome, int idade, int salario){
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }


    void mostrar(){
        System.out.println("Codigo: " + this.codigo );
		System.out.println("Nome: " + this.nome );
		System.out.println("Idade: " + this.idade);
		System.out.println("Salario: " + this.salario );
}
}