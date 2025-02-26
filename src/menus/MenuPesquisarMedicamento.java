package menus;
import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;


public class MenuPesquisarMedicamento {

    public static void pesquisarMedicamentos() {
        String cpfPInput = JOptionPane.showInputDialog("Informe o CPF do paciente para ver os medicamentos prescritos:");
        Paciente paciente = CadastroPaciente.PesquisarPaciente(cpfPInput);

        if (paciente != null) {
            if (paciente.getMedicamento().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum medicamento encontrado para o paciente " + paciente.getCpf());
            } else {
                JOptionPane.showMessageDialog(null, "Medicamentos do paciente " + paciente.getNome() + ": \n" + paciente.getMedicamento());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
        }
    }

}
