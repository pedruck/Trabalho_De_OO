package menus;

import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;
import java.util.Objects;

public class MenuAtualizarPaciente
{
    private static String novo_nome;
    private static String novo_cpf;
    private static String novo_data_nascimento;
    private static Paciente paciente;


    public static void MenuAtualizarCadastro() {
        String dialogo = "Informe o cpf do cadastro do paciente a ser atualizado";

        String cpfInput = JOptionPane.showInputDialog(dialogo);

        paciente = CadastroPaciente.PesquisarPaciente(cpfInput);

        if (paciente != null)
        {

            AtualizarNome();
            AtualizarDataNascimento();
            AtualizarCPF();
            CadastroPaciente.AtualizarPaciente(paciente, novo_nome, novo_data_nascimento, novo_cpf);
            JOptionPane.showMessageDialog(null,
                    "Informações recadastradas do paciente:\n" +
                            "Nome: " + paciente.getNome() + "\n" +
                            "CPF: " + paciente.getCpf() + "\n" +
                            "Data de Nascimento: " + paciente.getData_nascimento(),
                    "Cadastro Atualizado!", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal.RunMenuPrincipal();



        }


        if (cpfInput == null) {
            MenuPrincipal.RunMenuPrincipal();
        }



    }

    private static void AtualizarNome()
    {

        String dialogo = "Para atualizar o nome do paciente, escreva o novo nome a ser cadastrado abaixo!\n"
                + "Caso não queira atualizar o nome do paciente, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if(!Objects.equals(input, "0"))
        {
            novo_nome = input;
        }
        else
        {
            novo_nome = paciente.getNome();
        }

    }

    private static void AtualizarDataNascimento()
    {

        String dialogo = "Para atualizar a data de nascimento do paciente, escreva a nova data de nascimento do abaixo!\n"
                + "Caso não queira atualizar a data de nascimento do paciente, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if(!Objects.equals(input, "0"))
        {
            novo_data_nascimento = input;

        }
        else
        {
            novo_nome = paciente.getData_nascimento();
        }

    }

    private static void AtualizarCPF()
    {

        String dialogo = "Para atualizar o cpf do paciente, escreva o novo cpf abaixo!\n"
                + "Caso não queira atualizar o cpf do paciente, digite '0'.";
        String input = JOptionPane.showInputDialog(dialogo);
        if(!Objects.equals(input, "0")) {
            novo_cpf = input;

        }
        else
        {
            novo_cpf = paciente.getCpf();
        }




    }


}
