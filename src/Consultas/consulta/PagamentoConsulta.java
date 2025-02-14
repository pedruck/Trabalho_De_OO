import java.math.BigDecimal; // Importação correta

public class Pagamento {
    public static void realizarPagamento(Consulta consulta, BigDecimal valorPago) {
        if (consulta == null) throw new IllegalArgumentException("Consulta não encontrada.");

        // Garantindo que o valor da consulta não seja nulo
        BigDecimal valorConsulta = consulta.getValor();
        if (valorConsulta == null) throw new IllegalArgumentException("Valor da consulta inválido.");

        if (valorPago.compareTo(valorConsulta) >= 0) {
            consulta.pagar();
            System.out.println("Pagamento realizado com sucesso! Status: " + consulta.getStatus());
        } else {
            consulta.pendente();
            System.out.println("Pagamento insuficiente. Status: " + consulta.getStatus());
        }
    }
}
