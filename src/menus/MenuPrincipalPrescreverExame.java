package menus;

import cadastros.CadastroMedico;
import cadastros.CadastroPaciente;
import Consultas.Consulta;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MenuPrincipalPrescreverExame {

    public static void MenuCpfMedico(){
        String dialogo = "Informe seu cpf:";
        String cpfMInput = JOptionPane.showInputDialog(dialogo);
        CadastroMedico.PesquisarMedico(cpfMInput);
        MenuCpfPaciente();
    }

    public static void MenuCpfPaciente(){
        String cpfPInput = JOptionPane.showInputDialog("Informe o cpf do paciente:");
        MenuPrescreverExame(cpfPInput);
    }


    public static void MenuPrescreverExame(String cpfP) {
        Paciente paciente = CadastroPaciente.PesquisarPaciente(cpfP);
        if (paciente != null) {
            String exameInput = JOptionPane.showInputDialog("Informe o exame a ser realizado pelo paciente:");
            paciente.adicionarExame(exameInput);
            JOptionPane.showMessageDialog(null, "Exame adicionado com sucesso!");
            MenuExibirExame(paciente);
        } else {
            JOptionPane.showMessageDialog(null, "Paciente não encontrado.");
        }
    }


    public static void MenuExibirExame(Paciente paciente) {
        JOptionPane.showMessageDialog(null, "Exames do paciente " + paciente.getCpf() + ": \n" + paciente.getExames());
        MenuPrincipal.RunMenuPrincipal();
    }



}
