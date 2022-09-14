import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

// na hora da entregar procurar como mudar as cores do texto


public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner (System.in);
        int opt = 0, numero = 0, codFuncionario = 0, codBebidas = 0, codClientes = 0, idade = 0, salario = 0;
        String nome;
        List <Funcionario> bodegueiros = new ArrayList<>();    
        List <Clientes> cachaceiros = new ArrayList<>();
        List <Bebida> bebidas = new ArrayList<>();



        do{
            System.out.println("Digite o que deseja fazer; \n (1) Cadastrar Funcionario\n (2) Mostrar funcionarios\n (3) Cadastrar Bebidas\n (4) Mostrar Bebidas\n (5) Comprar Bebidas\n (6) Venda Bebidas\n (7) Cadastrar Clientes\n (8) Mostrar Clientes\n (9) Sair");
            opt = entrada.nextInt();

            if(opt == 1){                                                         /*cadastra funcionario*/

                entrada.nextLine();      //resolve bug que pula linha
				System.out.println("Digite o nome do funcionario:");
			    nome = entrada.nextLine();
                                     
                System.out.println("Digite a idade do funcionario:");
				idade = entrada.nextInt();

                System.out.println("Digite o salario do funcionario:");
				salario = entrada.nextInt();

                Funcionario novoFuncionario = new Funcionario(codFuncionario,nome,idade,salario);


				codFuncionario++;
				bodegueiros.add(novoFuncionario);
                
                // System.out.println("teste: " + bodegueiros.size());

            }else if(opt == 2){                                                   /*mostra funcionairo */
                for (int i = 0; i < bodegueiros.size(); i++) {
					Funcionario novoFuncionario = bodegueiros.get(i);
					novoFuncionario.mostrar();
                }

            }else if(opt == 3){                                                   /*cadastra bebida */

                entrada.nextLine();      //resolve bug que pula linha
                System.out.println("Digite o nome da bebida:");
				nome = entrada.nextLine();
                
                System.out.println("Digite o teor alcolico:");
				int teor = entrada.nextInt();

                System.out.println("Digite quantos mls vem:");
				int mililitros = entrada.nextInt();

                System.out.println("Digite o preco:");
				int preco = entrada.nextInt();

                System.out.println("Digite a quantidade em estoque:");
				int quantEstoque = entrada.nextInt();

                Bebida novaBebida = new Bebida(codBebidas,nome,teor,mililitros,preco,quantEstoque);

                codBebidas++;
                bebidas.add(novaBebida);


            }else if(opt == 4){                                                   /*mostrar bebidas*/
                for (int i = 0; i < bebidas.size(); i++) {
					Bebida novaBebida = bebidas.get(i);
					novaBebida.mostrar();

				}
            }else if(opt == 5){                                                   /*comprar bebidas*/

                entrada.nextLine();      //resolve bug que pula linha
                System.out.println("Digite o codigo da bebida que deseja comprar: ");
                codBebidas = entrada.nextInt();
                
                System.out.println("Digite a quantidade que deseja comprar: "); 
                numero = entrada.nextInt();
                
                Bebida novaBebida = bebidas.get(codBebidas);
				novaBebida.comprarBebida(numero);
                            
            }else if(opt == 6){                                                   /*vender bebidas*/
                System.out.println("Digite o codigo da bebida que deseja vender: ");
                codBebidas = entrada.nextInt();
                
                System.out.println("Digite a quantidade que deseja vender: "); 
                numero = entrada.nextInt();
                
                Bebida novaBebida = bebidas.get(codBebidas);
				novaBebida.venderBebida(numero);

            }else if(opt == 7){                                                   /*cadastra clientes */

                entrada.nextLine();      //resolve bug que pula linha
                System.out.println("Digite o nome do cliente:");
				nome = entrada.nextLine();
                entrada.nextLine();   

                System.out.println("Digite o cpf do cliente:");
				int cpf = entrada.nextInt();

                System.out.println("Digite 'true' se esta apto para venda fiada, se não digite 'false'");
                boolean vendaFiada = entrada.nextBoolean();

                Clientes novoCliente = new Clientes(codClientes,nome,cpf,vendaFiada); 

                codClientes++;
                cachaceiros.add(novoCliente);

            }else if(opt == 8){                                                   /*mostra clientes */
                for (int i = 0; i < cachaceiros.size(); i++) {
					Clientes novoClientes = cachaceiros.get(i);
					novoClientes.mostrar();

				}
        }

        }while(opt != 9);   
        
        entrada.close();
    }

}