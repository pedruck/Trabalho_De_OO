package menus;
import cadastros.CadastroMedico;
import pessoas_fisicas.especificos.Medico;
import pessoas_fisicas.Pessoa;

import javax.swing.*;
import java.util.Objects;

public class MenuAtualizarMedico {
    private static String novo_nome;
    private static String novo_cpf;
    private static String novo_data_nascimento;
    private static String novo_crm;
    private static String nova_especialidade;
    private static Medico medico;

    public static void MenuAtualizarCadastro() {
        String dialogo = "Informe o cpf do médico a ser atualizado";
        String cpfInput = JOptionPane.showInputDialog(dialogo);
        medico = CadastroMedico.PesquisarMedico(cpfInput);
        if (medico != null) {
            AtualizarNome();
            AtualizarNascimento();
            AtualizarCpf();
            AtualizarCrm();
            AtualizarEspecialidade();
            CadastroMedico.AtualizarMedico(medico, novo_nome, novo_data_nascimento, novo_cpf);
            JOptionPane.showMessageDialog(null,
                    "Informações recadastradas do paciente: \n" +
                            "Nome: " + medico.getNome() + "\n" +
                            "CPF: " + medico.getCpf() + "\n" +
                            "Data de nascimento: " + medico.getData_nascimento() + "\n" +
                            "CRM: " + medico.getCrm() + "\n" +
                            "Especialidade: " + medico.getEspecialidade(),
                    "Cadastro Atualizado!", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal.RunMenuPrincipal();
        }

        if (cpfInput == null) {
            MenuPrincipal.RunMenuPrincipal();
        }

    }

    public static void AtualizarNome() {
        String dialogo = "Para atualizar o nome do médico, escreva o novo nome a ser cadastrado abaixo!\n"
                + "Caso não queira atualizar o nome do médico, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if (!Objects.equals(input, "0")) {
            novo_nome = input;
        } else {
            novo_nome = medico.getNome();
        }


    }

    private static void AtualizarNascimento() {

        String dialogo = "Para atualizar a data de nascimento do médico, escreva a nova data de nascimento do abaixo!\n"
                + "Caso não queira atualizar a data de nascimento do médico, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if (!Objects.equals(input, "0")) {
            novo_data_nascimento = input;

        } else {
            novo_nome = medico.getData_nascimento();
        }

    }

    private static void AtualizarCpf() {

        String dialogo = "Para atualizar o cpf do médico, escreva o novo cpf abaixo!\n"
                + "Caso não queira atualizar o cpf do médico, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if (!Objects.equals(input, "0")) {
            novo_cpf = input;

        } else {
            novo_cpf = medico.getCpf();
        }


    }

    public static void AtualizarCrm() {
        String dialogo = "Para atualizar o crm do médico, escreva o novo crm a ser cadastrado abaixo!\n"
                + "Caso não queira atualizar o crm do médico, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if (!Objects.equals(input, "0")) {
            novo_crm = input;
        } else {
            novo_crm = medico.getCrm();
        }

    }

    public static void AtualizarEspecialidade() {
        String dialogo = "Para atualizar a especialidade do médico, escreva a nova especialidade a ser cadastrada abaixo!\n"
                + "Caso não queira atualizar a especialidade do médico, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if (!Objects.equals(input, "0")) {
            nova_especialidade = input;
        } else {
            nova_especialidade = medico.getEspecialidade();
        }

    }
}

