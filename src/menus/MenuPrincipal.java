package menus;

import javax.swing.*;

public class MenuPrincipal
{


    public static int MenuPrincipalGeral() {
        String opcoes =
                "1 - Cadastros\n" +
                "2 - Consultas\n" +
                "0 - Sair";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;
    }

    public static int MenuPrincipalCadastros() {
        String opcoes =
                        "1 - Menu de cadastro Médico\n" +
                        "2 - Menu de cadastro Paciente\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;
    }

    public static int MenuPrincipalConsultas() {
        String opcoes =
                        "1 - Agendar Consulta\n" +
                        "2 - Pagamento de Consultas\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;
    }

    public static int CadastrarMedico() {
        String opcoes =
                        "1 - Cadastrar novo médico\n" +
                        "2 - Editar cadastro existente\n" +
                        "3 - Remover cadastro existente\n" +
                        "4 - Procurar médico cadastrado\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;
    }

    public static int CadastrarPaciente() {
        String opcoes =
                        "1 - Cadastrar novo paciente\n" +
                        "2 - Editar cadastro existente\n" +
                        "3 - Remover cadastro existente\n" +
                        "4 - Procurar paciente cadastrado\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;
    }

    public static void RunMenuPrincipal() {
        int option = MenuPrincipal.MenuPrincipalGeral();

        switch (option) {
            case 1:

                option = MenuPrincipal.MenuPrincipalCadastros();
                switch (option)
                {
                    case 1:

                        option = MenuPrincipal.CadastrarMedico();
                        switch (option)
                        {
                            case 1:
                                MenuCadastroMedico.MenuCadastroNome();
                                break;

                            case 2:
                                //adicionar menu atualizar medico
                                break;

                            case 3:
                                MenuCadastroMedico.MenuRemoverMedico();
                                break;

                            case 4:
                                MenuCadastroMedico.MenuPesquisarMedico();

                            case 0:
                                MenuPrincipal.RunMenuPrincipal();
                                break;
                        }

                    case 2:

                        option = MenuPrincipal.CadastrarPaciente();
                        switch (option)
                        {
                            case 1:
                                MenuCadastroPaciente.MenuCadastroNome();
                                break;

                            case 2:
                                //adicionar menu atualizar paciente
                                break;

                            case 3:
                                MenuCadastroPaciente.MenuRemoverPaciente();
                                break;

                            case 4:
                                MenuCadastroPaciente.MenuPesquisarPaciente();

                            case 0:
                                MenuPrincipal.RunMenuPrincipal();
                                break;
                        }

                    case 0:

                        RunMenuPrincipal();
                        break;
                }
                break;

            case 2:

                option = MenuPrincipal.MenuPrincipalConsultas();
                break;


        }
    }

}
