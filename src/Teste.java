import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {

    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("resultado_exercicio3.txt"))) {

            ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 7, 25, "João Silva", "Dr. Carlos");

            String p1Info1 = "--- Dados Iniciais de p1 ---\n" +
                    "Paciente: " + p1.getNomePaciente() + "\n" +
                    "Médico: " + p1.getNomeMedico() + "\n" +
                    "Data: " + p1.getData() + "\n" +
                    "Hora: " + p1.getHora() + "\n";
            System.out.println(p1Info1);
            writer.println(p1Info1);

            System.out.println("\n--- Cadastrar Consulta p2 ---");
            writer.println("\n--- Cadastrar Consulta p2 ---");
            ConsultaAgendada p2 = new ConsultaAgendada();

            String p2Info = "\n--- Dados de p2 ---\n" +
                    "Paciente: " + p2.getNomePaciente() + "\n" +
                    "Médico: " + p2.getNomeMedico() + "\n" +
                    "Data: " + p2.getData() + "\n" +
                    "Hora: " + p2.getHora() + "\n";
            System.out.println(p2Info);
            writer.println(p2Info);

            System.out.println("\n--- Alterando dados de p1 ---");
            writer.println("\n--- Alterando dados de p1 ---");
            p1.setData();
            p1.setHora();
            p1.setNomePaciente();
            p1.setNomeMedico();

            String p1Info2 = "\n--- Novos Dados de p1 ---\n" +
                    "Paciente: " + p1.getNomePaciente() + "\n" +
                    "Médico: " + p1.getNomeMedico() + "\n" +
                    "Data: " + p1.getData() + "\n" +
                    "Hora: " + p1.getHora() + "\n";
            System.out.println(p1Info2);
            writer.println(p1Info2);

            String quantidadeFinal = "\nQuantidade final de consultas: " + ConsultaAgendada.getQuantidade();
            System.out.println(quantidadeFinal);
            writer.println(quantidadeFinal);

            System.out.println("\nResultado salvo em resultado_exercicio3.txt");

        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}