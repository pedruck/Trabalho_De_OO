public class PrincipalConsulta {
    public static void main(String[] args) {
        Consulta consulta = new Consulta("2025-02-15", "10:00", "João da Silva", "Dr. Carlos", "Agendada", "150.00");

        Medicamento medicamento1 = new Medicamento("Amoxicilina", "500mg", 30, "Tomar 1 comprimido a cada 8 horas");
        Medicamento medicamento2 = new Medicamento("Paracetamol", "750mg", 20, "Tomar 1 comprimido a cada 6 horas, se necessário");

        consulta.getPrescricao().prescreverMedicamento(medicamento1);
        consulta.getPrescricao().prescreverMedicamento(medicamento2);

        consulta.getPrescricao().exibirMedicamentos();

        try {
            Pagamento.realizarPagamento(consulta, new BigDecimal("150.00"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar o pagamento: " + e.getMessage());
        }

        System.out.println("Status final da consulta: " + consulta.getStatus());
    }
}
