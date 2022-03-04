import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;

public class ManterAluno {
    
    public static void inserirAluno(Vector<Aluno> alunos) throws Exception {
        Scanner leitor = new Scanner(System.in);
        Aluno novoAluno = new Aluno();

        System.out.println("Digite as informações do aluno: \n");
        
        System.out.println("nome: ");
        novoAluno.setNome(leitor.nextLine()); 

        System.out.println("email: ");
        novoAluno.setEmail(leitor.nextLine());

        System.out.println("GRR: ");
        novoAluno.setGRR(leitor.nextLine());

        alunos.add(novoAluno);

    }

    public static void removerAluno(Vector<Aluno> alunos, String nomeAluno) throws Exception {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equals(nomeAluno)) {
                alunos.remove(i);
            }
        }
    }

    public static void salvarAlunos(Vector<Aluno> alunos) throws Exception {
        Arquivo.gravaAlunos(alunos);
    }

    public static void recuperarAlunos() {
        Vector<String> alunos = Arquivo.leAlunos();

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public static void verAlunos(Vector<Aluno> alunos) throws Exception {
        for (Aluno aluno : alunos) {
            System.out.println("nome: " +aluno.getNome()+ " email: " +aluno.getEmail()+ " GRR: " +aluno.getGRR());
        }
    }
}
