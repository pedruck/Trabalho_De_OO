package menus;
import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;


public class MenuPesquisarExame {

    public static void pesquisarExames() {
        String cpfPInput = JOptionPane.showInputDialog("Informe o CPF do paciente para ver os exames:");
        Paciente paciente = CadastroPaciente.PesquisarPaciente(cpfPInput);

        if (paciente != null) {
            if (paciente.getExames().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhum exame encontrado para o paciente " + paciente.getCpf());
            } else {
                JOptionPane.showMessageDialog(null, "Exames do paciente " + paciente.getNome() + ": \n" + paciente.getExames());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
        }
    }

}
