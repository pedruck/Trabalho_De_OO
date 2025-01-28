package menus;

public class MenuPrincipal
{
    public static String MenuPrincipalGeral()
    {
        String opcoes =
                "1 - Cadastros\n" +
                "2 - Consultas\n" +
                "0 - Sair";


        return opcoes;

    }

    public static String MenuPrincipalCadastros()
    {
        String opcoes =
                        "1 - Cadastrar Médico\n" +
                        "2 - Cadastrar Paciente\n" +
                        "0 - Voltar";

        return opcoes;

    }

    public static String MenuPrincipalConsultas()
    {
        String opcoes =
                        "1 - Agendar Consulta\n" +
                        "2 - Pagamento de Consultas\n" +
                        "0 - Voltar";

        return opcoes;

    }

}
