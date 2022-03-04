import java.util.Scanner;
import java.util.Vector;

public class Menu {
    public static void main (String[] args) throws Exception {
        System.out.println("Escolha uma ação:\n1) para inserir alunos\n2) para ver alunos inseridos\n3) para remover alunos inseridos\n4) para gravar alunos inseridos\n5) para visualizar alunos gravados\n6) para sair");
        Scanner teclado = new Scanner(System.in);

        Vector<Aluno> vetorGeral = new Vector<Aluno>();
        int entrada = teclado.nextInt();

        while (entrada != 6) {

            switch (entrada) {
                case 1:
                    ManterAluno.inserirAluno(vetorGeral);
                    break;
                case 2:
                    ManterAluno.verAlunos(vetorGeral);
                    break;
                case 3:
                    Scanner aux = new Scanner(System.in);

                    System.out.println("Digite o nome do aluno que deseja remover: ");
                    String nome = aux.next();

                    ManterAluno.removerAluno(vetorGeral, nome);
                    break;
                case 4: 
                    ManterAluno.salvarAlunos(vetorGeral);
                    break;
                case 5:
                    ManterAluno.recuperarAlunos();
                    break;
            }

            System.out.println("Escolha uma ação:\n1) para inserir alunos\n2) para ver alunos inseridos\n3) para remover alunos inseridos\n4) para gravar alunos inseridos\n5) para visualizar alunos gravados\n6) para sair");
            entrada = teclado.nextInt();

        }

        teclado.close();
    }
}
