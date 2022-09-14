public class Bebida {
    int codigo;
    String nome;
    int teor;
    int mililitros;
    int preco;
    int quantEstoque;

    // metodo construtor
    Bebida (){}
    Bebida(int codigo, String nome, int teor, int mililitros, int preco, int quantEstoque){
        this.codigo = codigo;
        this.nome = nome;
        this.teor = teor;
        this.mililitros = mililitros;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    void comprarBebida(int numero){
        this.quantEstoque +=numero;
		System.out.println("\nEstoque atualizado!");
		System.out.printf ("Quantidade atual é igual à " + this.quantEstoque+ "\n");
    }
    
    void venderBebida(int numero){
        this.quantEstoque -=numero;
		System.out.println("\nEstoque atualizado!");
		System.out.printf ("Quantidade atual é igual à " + this.quantEstoque+ "\n");
    }

    void mostrar(){
        System.out.println("Codigo: " + this.codigo );
		System.out.println("Nome: " + this.nome );
		System.out.println("Teor: " + this.teor);
		System.out.println("Mililitros: " + this.mililitros );
		System.out.println("Preco: " + this.preco );
		System.out.println("Quantidade em Estoque: " + this.quantEstoque );
    }
}

