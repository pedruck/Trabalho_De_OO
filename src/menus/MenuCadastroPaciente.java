package menus;

import cadastros.CadastroMedico;
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

        nome = JOptionPane.showInputDialog(dialogo);
        if (nome == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }
        else{
            MenuCadastroCpf(); }
    }

    public static void MenuCadastroCpf()
    {
        String dialogo = "Informe o cpf do paciente:";

        String cpfInput = JOptionPane.showInputDialog(dialogo);
        cpf = cpfInput;

        if (cpfInput == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }

        if(paciente != null && CadastroPaciente.PesquisarPaciente(cpfInput) != null ) {
            JOptionPane.showMessageDialog(new JFrame("Cadastro concluido!"),
                    "ERRO: CPF já cadastrado!");

            MenuPrincipal.RunMenuPrincipal();
        }
        else {
            MenuCadastroDataNascimento();
        }
    }

    public static void MenuRemoverPaciente()
    {
        String dialogo = "Informe o cpf a ser removido:";
        String cpfInput = JOptionPane.showInputDialog(dialogo);
        cpf = cpfInput;

        CadastroPaciente.RemoverPaciente(cpf);

        JOptionPane.showMessageDialog(null, "Cadastro removido!");
        MenuPrincipal.RunMenuPrincipal();
    }

    public static void MenuPesquisarPaciente() {
        String dialogo = "Informe o CPF do paciente:";
        String cpfInput = JOptionPane.showInputDialog(dialogo);

        if (cpfInput == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }

        cpfInput = cpfInput.trim();
        Paciente pacienteEncontrado = CadastroPaciente.PesquisarPaciente(cpfInput);

        if (pacienteEncontrado == null) {
            JOptionPane.showMessageDialog(null, "Erro: Paciente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            MenuPrincipal.RunMenuPrincipal();
            return;
        }

        JOptionPane.showMessageDialog(null,
                pacienteEncontrado.exibirDetalhes(),
                "Cadastro Encontrado", JOptionPane.INFORMATION_MESSAGE);
    }


    public static void MenuCadastroDataNascimento()
    {
        String dialogo = "Informe a data de nascimento do paciente:";
        String dataInput = JOptionPane.showInputDialog(dialogo);
        data_nascimento = dataInput;

        if (dataInput == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }

        paciente = new Paciente(nome, cpf, data_nascimento);

        JOptionPane.showMessageDialog(new JFrame("Cadastro concluido!"),
                "Informações cadastradas do paciente:\n" +
                        "Nome: " + paciente.getNome() +"\n" +
                        "CPF: " + paciente.getCpf() +"\n" +
                        "Data de Nascimento: " + paciente.getData_nascimento());


        GetCadastro().CadastrarPaciente(paciente);
        MenuPrincipal.RunMenuPrincipal();

    }








}
