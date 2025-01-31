package menus;

import cadastros.CadastroMedico;
import pessoas_fisicas.especificos.Medico;

import javax.swing.*;

public class MenuCadastroMedico {

    private static String nome;
    private static String cpf;
    private static String dataNascimento;
    private static String crm;
    private static String especialidade;
    private static Medico medico;
    private static CadastroMedico cadastro;

    private static CadastroMedico GetCadastro() {
        if (cadastro == null) {
            cadastro = new CadastroMedico();
        }
        return cadastro;
    }

    public static void MenuCadastroNome() {
        String dialogo = "Informe o nome do médico:";
        nome = JOptionPane.showInputDialog(dialogo);
        if (nome == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }
        else{
        MenuCadastroCpf(); }
    }

    public static void MenuCadastroCpf() {
        String dialogo = "Informe o cpf do médico:";
        String cpfInput = JOptionPane.showInputDialog(dialogo);
        cpf = cpfInput;

        if (cpfInput == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }

        if(medico != null && cadastro.PesquisarMedico(cpfInput) != null ) {
            JOptionPane.showMessageDialog(new JFrame("Cadastro concluido!"),
                    "ERRO: CPF já cadastrado!");
            nome = "";
            MenuPrincipal.RunMenuPrincipal();
        }
        else {
            MenuCadastroDataNascimento();
        }
    }

    public static void MenuCadastroDataNascimento() {
        String dialogo = "Informe a data de nascimento do médico:";
        dataNascimento = JOptionPane.showInputDialog(dialogo);

        if (dataNascimento == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }
        else{
        MenuCadastroCrm(); }
    }

    public static void MenuCadastroCrm() {
        String dialogo = "Informe o CRM do médico:";
        crm = JOptionPane.showInputDialog(dialogo);

        if (crm == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }
        else{
        MenuCadastroEspecialidade(); }
    }

    public static void MenuCadastroEspecialidade() {
        String dialogo = "Informe a especialidade do médico:";
        especialidade = JOptionPane.showInputDialog(dialogo);

        if (especialidade == null) {
            MenuPrincipal.RunMenuPrincipal();
            return;
        }
        else{
        ConfirmarCadastro(); }
    }

    public static void ConfirmarCadastro() {
        medico = new Medico(nome, cpf, dataNascimento, crm, especialidade);

        JOptionPane.showMessageDialog(null,
                "Informações cadastradas do médico:\n" +
                        "Nome: " + medico.getNome() + "\n" +
                        "CPF: " + medico.getCpf() + "\n" +
                        "Data de Nascimento: " + medico.getData_nascimento() + "\n" +
                        "CRM: " + medico.getCrm() + "\n" +
                        "Especialidade: " + medico.getEspecialidade(),
                "Cadastro Concluído", JOptionPane.INFORMATION_MESSAGE);

        GetCadastro().CadastrarMedico(medico);
        MenuPrincipal.RunMenuPrincipal();
    }
}

