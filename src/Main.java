import menus.MenuPrincipal;



public class Main {
    public static void main(String[] args)
    {



    int option = MenuPrincipal.MenuPrincipalGeral();

    switch (option)
    {
        case 1:

            option = MenuPrincipal.MenuPrincipalCadastros();
            break;

        case 2:

            option = MenuPrincipal.MenuPrincipalConsultas();
            break;


    }

    //to do: execoes do joptionpannel

    }
}