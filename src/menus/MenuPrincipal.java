package menus;

import javax.swing.*;

public class MenuPrincipal
{
    public static int MenuPrincipalGeral()
    {
        String opcoes =
                "1 - Cadastros\n" +
                "2 - Consultas\n" +
                "0 - Sair";

        String option_pannel = JOptionPane.showInputDialog(opcoes);

        int opcao = Integer.parseInt(option_pannel);



        return opcao;

    }

    public static int MenuPrincipalCadastros()
    {
        String opcoes =
                        "1 - Cadastrar Médico\n" +
                        "2 - Cadastrar Paciente\n" +
                        "0 - Voltar";


        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;

    }

    public static int MenuPrincipalConsultas()
    {
        String opcoes =
                        "1 - Agendar Consulta\n" +
                        "2 - Pagamento de Consultas\n" +
                        "0 - Voltar";

        String option_pannel = JOptionPane.showInputDialog(opcoes);
        int opcao = Integer.parseInt(option_pannel);

        return opcao;



    }

}
