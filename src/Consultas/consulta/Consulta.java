import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private String data;
    private String horario;
    private String paciente;
    private String medico;
    private String status;
    private BigDecimal valor;
    private boolean pago;
    private List<Medicamento> prescricao;

    public Consulta(String data, String horario, String paciente, String medico, String status, BigDecimal valor) {
        if (data == null || data.isBlank()) throw new IllegalArgumentException("A data é obrigatória.");
        if (horario == null || horario.isBlank()) throw new IllegalArgumentException("O horário é obrigatório.");
        if (paciente == null || paciente.isBlank()) throw new IllegalArgumentException("O paciente é obrigatório.");
        if (medico == null || medico.isBlank()) throw new IllegalArgumentException("O médico é obrigatório.");
        if (status == null || status.isBlank()) status = "Agendada";

        this.data = data;
        this.horario = horario;
        this.paciente = paciente;
        this.medico = medico;
        this.status = status;
        this.valor = valor;
        this.pago = false;
        this.prescricao = new ArrayList<>();
    }

    public static Consulta agendarConsulta(String data, String horario, String paciente, String medico, String status, BigDecimal valor) {
        return new Consulta(data, horario, paciente, medico, status, valor);
    }

    public void realizarPagamento(BigDecimal valorPago) {
        if (valor == null) throw new IllegalArgumentException("Valor da consulta inválido.");
        if (valorPago.compareTo(valor) >= 0) {
            this.pago = true;
            this.status = "Paga";
            System.out.println("Pagamento realizado com sucesso! Status: " + this.status);
        } else {
            this.pago = false;
            this.status = "Pendente";
            System.out.println("Pagamento insuficiente. Status: " + this.status);
        }
    }

    public void prescreverMedicamento(Medicamento medicamento) {
        if (medicamento == null) throw new IllegalArgumentException("Medicamento inválido.");
        this.prescricao.add(medicamento);
    }

    public void exibirPrescricao() {
        if (prescricao.isEmpty()) {
            System.out.println("Nenhum medicamento prescrito.");
        } else {
            System.out.println("Medicamentos prescritos:");
            for (Medicamento medicamento : prescricao) {
                medicamento.exibirInformacoes();
            }
        }
    }

    public String getStatus() {
        return pago ? "Pago" : "Pendente";
    }

    public BigDecimal getValor() {
        return valor;
    }
}
