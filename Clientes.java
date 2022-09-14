public class Clientes {
    int codigo;
    String  nome;
    int cpf;
    boolean vendaFiada;

    // metodo construtor
    Clientes(){}
    Clientes(int codigo, String nome, int cpf, boolean vendaFiada){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.vendaFiada = vendaFiada;
    }

    void mostrar(){
        System.out.println("Codigo: " + this.codigo );
		System.out.println("Nome: " + this.nome );
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Venda fiada: " + this.vendaFiada);
    }
}