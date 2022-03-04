import java.util.Vector;
import java.util.Scanner;
import java.io.*;

public class Arquivo {
    
    public static void gravaAlunos(Vector<Aluno> alunos) throws Exception {
        try {
            File arquivo = new File("alunos.txt");

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso.\n");
            } else {
                System.out.println("Arquivo já existe e será sobrescrito.\n");
            }

            FileWriter escrivao = new FileWriter("alunos.txt");

            for (Aluno aluno : alunos) {
                   escrivao.write("nome: " +aluno.getNome() +" email: " + aluno.getEmail() + " GRR: " + aluno.getGRR()); 
            }
            escrivao.close();

        } catch (IOException error) {
            System.out.println("Erro ao criar arquivo");
            error.printStackTrace();
        }
    }

    public static Vector<String> leAlunos() {
        try {
            File arquivo = new File("alunos.txt");

            Scanner leitor = new Scanner(arquivo);
            
            Vector<String> vetorAlunos = new Vector<String>();
            String linha;

            while(leitor.hasNextLine()) {
                linha = leitor.nextLine();

                vetorAlunos.add(linha);
            }


            return vetorAlunos;
        } catch (IOException error) {
            System.out.println("Erro ao ler arquivo.");
            error.printStackTrace();
        }
        return null;
    }
}
