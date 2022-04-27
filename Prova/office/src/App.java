import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        dadosPessoas();
    }

    public static void dadosPessoas() {
        Scanner sc = new Scanner(System.in);
        func pessoa;
        Section projeto;
        List<func> listaPessoas = new ArrayList<func>();
        List<Section> listaProjeto = new ArrayList<Section>();
        int opcao = 0;

        do {
            System.out.println("## Escolha uma das opções abaixo ##");
            System.out.println("Opção 1 - Cadastra pessoas");
            System.out.println("Opção 2 - Cadastrar Projetos");
            System.out.println("Opção 3 - Imprime pessoas cadastradas");
            System.out.println("Opção 4 - Imprime projetos cadastrados");
            System.out.println("Opção 0 - Sair do programa");
            System.out.println("_______________________");

            System.out.print("Digite aqui sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1) {
                pessoa = new func();

                System.out.print("Digite o cpf: ");
                pessoa.setCpf(Integer.parseInt(sc.nextLine()));

                System.out.print("Digite o nome: ");
                pessoa.setNome(sc.nextLine());

                System.out.print("Digite o endereço: ");
                pessoa.setEndereco(sc.nextLine());

                System.out.println();

                listaPessoas.add(pessoa);
            
            } 
            if (opcao == 2) {
                projeto = new Section();

                System.out.print("Digite o nome: ");
                projeto.setNome(sc.nextLine());

                System.out.print("Digite o tempo: ");
                projeto.setTempo(sc.nextFloat());

                System.out.print("Digite o custo: ");
                projeto.setCusto(sc.nextFloat());

                System.out.println();

                listaProjeto.add(projeto);
                
            }

            else if (opcao == 3) {
                if (listaPessoas.isEmpty()) {
                    System.out.println("Não existem funcionarios cadastrados, pressione uma tecla para continuar!");
                    sc.nextLine();
                } else {
                    System.out.println(listaPessoas.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }
            }  else if (opcao == 4) {
                if (listaProjeto.isEmpty()) {
                    System.out.println("Não existem projetos cadastradas, pressione uma tecla para continuar!");
                    sc.nextLine();
                } else {
                    System.out.println(listaProjeto.toString());

                    System.out.println("Pressione um tecla para continuar.");
                    sc.nextLine();
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}