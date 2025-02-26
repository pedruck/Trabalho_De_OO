package menus;

import javax.swing.*;

public class MenuPrincipal
{

    public static int MenuPrincipalGeral() {
        String opcoes =
                "1 - Cadastros\n" +
                "2 - Consultas\n" +
                "3 - Prescrições\n" +
                "0 - Sair";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int MenuPrincipalCadastros() {
        String opcoes =
                "Selecione o tipo de cadastro" + "\n" +
                        "1 - Cadastro Médico\n" +
                        "2 - Cadastro Paciente\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int MenuPrincipalConsultas() {
        String opcoes =
                        "1 - Agendar Consulta\n" +
                        "2 - Realizar Pagamento Pendente\n" +
                                "3 - Pesquisar Consulta" + "\n" +
                                "4 - Atualizar Consulta" + "\n" +
                                "5 - Pesquisar Consulta" + "\n"+
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);

        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }



    }

    public static int CadastrarMedico() {
        String opcoes =
                        "1 - Cadastrar novo médico\n" +
                        "2 - Editar cadastro existente\n" +
                        "3 - Remover cadastro existente\n" +
                        "4 - Procurar médico cadastrado\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int CadastrarPaciente() {
        String opcoes =
                        "1 - Cadastrar novo paciente\n" +
                        "2 - Editar cadastro existente\n" +
                        "3 - Remover cadastro existente\n" +
                        "4 - Procurar paciente cadastrado\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int MenuMedicamentos() {
        String opcoes =
                        "1 - Prescrever medicamento\n" +
                        "2 - Procurar prescrição\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int MenuExames() {
        String opcoes =
                        "1 - Prescrever exame\n" +
                        "2 - Procurar exame\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static int MenuPescricoes() {
        String opcoes =
                        "1 - Exames\n" +
                        "2 - Medicamentos\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        if (option_pannel == null)
        {
            System.exit(0);
            return 0;
        }
        else { return Integer.parseInt(option_pannel); }
    }

    public static void ErroOpcaoInvalida() {

        JOptionPane.showMessageDialog(null, "Erro: Opção Invalida!", "Erro", JOptionPane.ERROR_MESSAGE);
        MenuPrincipal.RunMenuPrincipal();

    }


    public static void RunMenuPrincipal() {

    try
    {



            int option = MenuPrincipal.MenuPrincipalGeral();

            switch (option) {
                case 1:

                    option = MenuPrincipal.MenuPrincipalCadastros();
                    switch (option)
                    {
                        case 1:

                            RunMenuCadastroMedico(option);
                            break;

                        case 2:
                            RunMenuCadastroPaciente(option);

                            break;

                        case 0:

                            RunMenuPrincipal();
                            break;

                        default:
                            ErroOpcaoInvalida();
                            break;
                    }

                break;

                case 2:

                    option = MenuPrincipal.MenuPrincipalConsultas();
                    switch (option)
                    {
                        case 1:
                            MenuConsultas.MenuDataConsulta();

                            break;

                        case 2:
                            MenuPagamento.ExecutarMenusPagamento();
                            break;

                        case 3:
                            MenuConsultas.MenuPesquisarConsulta();

                            break;

                        case 4:


                            break;

                        default:
                            ErroOpcaoInvalida();
                            break;

                    }
                    break;

                case 3:

                    option = MenuPrincipal.MenuPescricoes();
                    switch (option)
                    {
                        case 1:
                            option = MenuPrincipal.MenuExames();
                            switch (option) {
                                case 1:
                                    break;

                                case 2:
                                    break;
                            }

                        case 2:
                            option = MenuPrincipal.MenuMedicamentos();
                            switch (option) {
                                case 1:
                                    break;

                                case 2:
                                    break;
                            }

                        default:
                            ErroOpcaoInvalida();
                            break;
                    }
                    break;

                default:
                    ErroOpcaoInvalida();
                    break;

            }
    }
    catch(NumberFormatException e)
    {
        ErroOpcaoInvalida();
    }
    }

    public static void RunMenuCadastroPaciente(int option)
        {
            try
            {
                option = MenuPrincipal.CadastrarPaciente();
                switch (option)
                {
                    case 1:
                        MenuCadastroPaciente.MenuCadastroNome();
                        break;

                    case 2:
                        MenuAtualizarPaciente.MenuAtualizarCadastro();
                        break;

                    case 3:
                        MenuCadastroPaciente.MenuRemoverPaciente();
                        break;

                    case 4:
                        MenuCadastroPaciente.MenuPesquisarPaciente();

                    case 0:
                        MenuPrincipal.RunMenuPrincipal();
                        break;

                    default:

                        ErroOpcaoInvalida();
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                ErroOpcaoInvalida();
            }
        }

        public static void RunMenuCadastroMedico(int option)
        {
            try {

                option = MenuPrincipal.CadastrarMedico();
                switch (option) {
                    case 1:
                        MenuCadastroMedico.MenuCadastroNome();
                        break;

                    case 2:
                        MenuAtualizarMedico.MenuAtualizarCadastro();
                        break;

                    case 3:
                        MenuCadastroMedico.MenuRemoverMedico();
                        break;

                    case 4:
                        MenuCadastroMedico.MenuPesquisarMedico();
                        break;

                    case 0:
                        MenuPrincipal.RunMenuPrincipal();
                        break;

                    default:
                        ErroOpcaoInvalida();
                        break;


                }
            }
            catch (NumberFormatException e)
            {

                ErroOpcaoInvalida();

            }
        }

}



