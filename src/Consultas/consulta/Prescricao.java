import java.util.ArrayList;
import java.util.List;

public class Prescricao {

    private List<Medicamento> medicamentos;  // Lista de medicamentos prescritos

    // Construtor
    public Prescricao() {
        this.medicamentos = new ArrayList<>();
    }

    // Método para prescrever um medicamento
    public void prescreverMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    // Método para exibir todos os medicamentos prescritos
    public void exibirMedicamentos() {
        if (medicamentos.isEmpty()) {
            System.out.println("Nenhum medicamento prescrito.");
        } else {
            System.out.println("Medicamentos prescritos:");
            for (Medicamento medicamento : medicamentos) {
                medicamento.exibirInformacoes();
            }
        }
    }
}
