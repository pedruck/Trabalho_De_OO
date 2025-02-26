package menus;

import cadastros.CadastroMedico;
import cadastros.CadastroPaciente;
import Consultas.Consulta;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipalPrescreverMedicamento {

    public static void MenuCpfMedico(){
        String dialogo = "Informe seu cpf:";
        String cpfMInput = JOptionPane.showInputDialog(dialogo);
        CadastroMedico.PesquisarMedico(cpfMInput);
        MenuCpfPaciente();
    }

    public static void MenuCpfPaciente(){
        String cpfPInput = JOptionPane.showInputDialog("Informe o cpf do paciente:");
        MenuPrescreverMedicamento(cpfPInput);
    }


    public static void MenuPrescreverMedicamento(String cpfP) {
        Paciente paciente = CadastroPaciente.PesquisarPaciente(cpfP);
        if (paciente != null) {
            String medicamentoInput = JOptionPane.showInputDialog("Informe o medicamento a ser prescrito ao paciente:");
            paciente.adicionarMedicamento(medicamentoInput);
            JOptionPane.showMessageDialog(null, "Medicamento adicionado com sucesso!");
            MenuExibirMedicamento(paciente);
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
        }
    }


    public static void MenuExibirMedicamento(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "Medicamentos prescritos " + paciente.getCpf() + ": \n" + paciente.getMedicamento());
        MenuPrincipal.RunMenuPrincipal();
    }



}
