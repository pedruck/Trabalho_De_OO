package menus;

import cadastros.CadastroConsultas;
import cadastros.CadastroPaciente;
import pessoas_fisicas.especificos.Paciente;

import javax.swing.*;
import java.util.Objects;

public class MenuPagamento
{



    public static void ExecutarMenusPagamento()
    {
        String dialogo = "Digite o cpf do paciente:";

        String input = JOptionPane.showInputDialog(dialogo);

        Paciente paciente = CadastroPaciente.PesquisarPaciente(input);


        if(paciente == null || paciente.isPagamento_pendente() == false)
        {

            JOptionPane.showMessageDialog(null, "Erro: Pagamento pendente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            MenuPrincipal.RunMenuPrincipal();

        }
        else
        {

            String dialogo2 = "Pagamento pendente encontrado:" +"\n" +
                              "Valor:" + paciente.getValor_a_ser_pago() + "\n" + "\n" +
                                "1: Pagar o valor pendente" + "\n" +
                                "2: Voltar";

            int input2 = Integer.parseInt(JOptionPane.showInputDialog(dialogo2));

            switch (input2)
            {
                case 1:
                    paciente.setValor_a_ser_pago(0);
                    paciente.setPagamento_pendente(false);
                    MenuPrincipal.RunMenuPrincipal();
                    break;

                case 2:
                    MenuPrincipal.RunMenuPrincipal();
                    break;

                default:
                    MenuPrincipal.RunMenuPrincipal();
                    break;
            }


        }




    }




}
