public class Consulta {
    private String data;
    private String horario;
    private String paciente;
    private String medico;
    private String status;
    private String valor;
    private boolean pago;  // Indica se a consulta foi paga
    private Prescricao prescricao;  // A consulta agora tem uma prescrição associada

    // Construtor
    public Consulta(String data, String horario, String paciente, String medico, String status,
                    String valor) {
        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.medico = medico;
        this.status = status;
        this.valor = valor;
        this.pago = false;  // Inicialmente, a consulta não está paga
        this.prescricao = new Prescricao();  // Inicializa a prescrição para essa consulta
    }

    // Métodos getters
    public String getValor() {
        return valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void pagar() {
        this.pago = true;
        this.status = "Paga";  // Atualiza o status para "Paga"
    }

    public void pendente() {
        this.pago = false;
        this.status = "Pendente";  // Atualiza o status para "Pendente"
    }

    public String getStatus() {
        return pago ? "Pago" : "Pendente";
    }

    // Método para acessar a prescrição e prescrever medicamentos
    public Prescricao getPrescricao() {
        return prescricao;
    }
}
