import java.util.Scanner;

public class ConsultaAgendada {
    public Data data;
    public Hora hora;
    public String nomePaciente;
    public static int quantidade = 0; // Atributo estático
    private String nomeMedico;

    public ConsultaAgendada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cadastro de Nova Consulta ---");

        System.out.print("Digite o dia: ");
        int d = scanner.nextInt();
        System.out.print("Digite o mês: ");
        int m = scanner.nextInt();
        System.out.print("Digite o ano: ");
        int a = scanner.nextInt();
        this.data = new Data(d, m, a);

        System.out.print("Digite a hora: ");
        int h = scanner.nextInt();
        System.out.print("Digite o minuto: ");
        int mi = scanner.nextInt();
        System.out.print("Digite o segundo: ");
        int s = scanner.nextInt();
        this.hora = new Hora(h, mi, s);

        scanner.nextLine();
        System.out.print("Digite o nome do paciente: ");
        this.nomePaciente = scanner.nextLine();

        System.out.print("Digite o nome do médico: ");
        this.nomeMedico = scanner.nextLine();

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String med) {
        this.hora = new Hora(h, mi, s);
        this.data = new Data(d, m, a);
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String med) {
        this.data = d;
        this.hora = h;
        this.nomePaciente = p;
        this.nomeMedico = med;
        quantidade++;
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora(int h, int mi, int s) {
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo dia: ");
        int d = scanner.nextInt();
        System.out.print("Digite o novo mês: ");
        int m = scanner.nextInt();
        System.out.print("Digite o novo ano: ");
        int a = scanner.nextInt();
        this.data = new Data(d, m, a);
    }

    public void setHora() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nova hora: ");
        int h = scanner.nextInt();
        System.out.print("Digite o novo minuto: ");
        int mi = scanner.nextInt();
        System.out.print("Digite o novo segundo: ");
        int s = scanner.nextInt();
        this.hora = new Hora(h, mi, s);
    }

    public void setNomePaciente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo nome do paciente: ");
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomeMedico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o novo nome do médico: ");
        this.nomeMedico = scanner.nextLine();
    }

    public String getData() {
        return String.format("%02d/%02d/%02d", data.getDia(), data.getMes(), data.getAno()); // Formato dd/mm/aa [cite: 9]
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", hora.getHoras(), hora.getMinutos(), hora.getSegundos()); // Formato hh:mm:ss [cite: 10]
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public static int getQuantidade() {
        return quantidade;
    }
}