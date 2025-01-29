package menus;

import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;

public class MenuCadastroPaciente
{

    private static String nome;
    private static String cpf;
    private static String data_nascimento;
    private static Paciente paciente;
    private static CadastroPaciente cadastro;

    private static CadastroPaciente GetCadastro()
    {
        if (cadastro == null)
        {
            cadastro = new CadastroPaciente();

        }
        return cadastro;
    }



    public static void MenuCadastroNome()
    {
        String dialogo = "Informe o nome do paciente:";

        String option_pannel = JOptionPane.showInputDialog(dialogo);
        String input = String.valueOf(option_pannel);

        nome = input;

        MenuCadastroCpf();

    }
    public static void MenuCadastroCpf()
    {
        String dialogo = "Informe o cpf do paciente:";

        String option_pannel = JOptionPane.showInputDialog(dialogo);
        String input = String.valueOf(option_pannel);

        cpf = input;


        if(paciente != null && cadastro.PesquisarPaciente(input) != null )
        {
            JOptionPane.showMessageDialog(new JFrame("Cadastro concluido!"),
                    "ERRO: CPF já cadastrado!");
            nome = "";
            MenuPrincipal.RunMenuPrincipal();

        }
        else
        {
            MenuCadastroDataNascimento();
        }

    }

    public static void MenuCadastroDataNascimento()
    {
        String dialogo = "Informe a data de nascimento do paciente:";

        String option_pannel = JOptionPane.showInputDialog(dialogo);
        String input = String.valueOf(option_pannel);

        data_nascimento = input;

        paciente = new Paciente(nome, cpf, data_nascimento);

        JOptionPane.showMessageDialog(new JFrame("Cadastro concluido!"),
                "Informações cadastradas do paciente:\n" +
                        "Nome: " + paciente.getNome() +"\n" +
                        "CPF: " + paciente.getCpf() +"\n" +
                        "Data de Nascimento: " + paciente.getData_nascimento());


        GetCadastro().CadastrarPaciente(paciente);
        MenuPrincipal.RunMenuPrincipal();

    }

    //codigo temporario








}
