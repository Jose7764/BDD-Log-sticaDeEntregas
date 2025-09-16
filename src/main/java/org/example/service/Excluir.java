package org.example.service;

import org.example.dao.ClienteDAO;
import org.example.dao.EntregaDAO;
import org.example.dao.MotoristaDAO;
import org.example.model.Cliente;
import org.example.model.Entrega;
import org.example.model.Motorista;
import org.example.util.Erros;
import org.example.view.View;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Excluir {

    public static void excluirEntrega(Scanner sc){
        List<Entrega> listEntrega = EntregaDAO.listarEntregas();
        boolean valido = false;

        View.texto(" _____________________");
        View.cabecalho("|   EXCLUIR ENTREGA   |");
        View.cabecalho("|_____________________|");

        while(!valido){
            View.texto("ID da entrega:");
            int id = Erros.entradaInt();

            for(Entrega entrega : listEntrega){
                if(entrega.getId() == id){
                    try{
                        EntregaDAO.excluirEntrega(entrega);
                        valido = true;
                        break;
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
            if(!valido){
                View.texto("Entrega não encontrada.");
            }
        }
    }

    public static void excluirCliente(Scanner sc){
        List<Cliente> listCliente = ClienteDAO.listarClientes();
        boolean valido = false;

        View.texto(" _____________________");
        View.cabecalho("|   EXCLUIR CLIENTE   |");
        View.cabecalho("|_____________________|");

        while(!valido){
            View.texto("ID do cliente:");
            int id = Erros.entradaInt();

            for(Cliente cliente : listCliente){
                if(cliente.getId() == id){
                    try{
                        ClienteDAO.deletarCliente(cliente);
                        valido = true;
                        break;
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
            if(!valido){
                View.texto("Cliente não encontrado.");
            }
        }
    }

    public static void excluirMotorista(Scanner sc){
        List<Motorista> listMotorista = MotoristaDAO.listarMotoristas();
        boolean valido = false;

        View.texto(" _______________________");
        View.cabecalho("|   EXCLUIR MOTORISTA   |");
        View.cabecalho("|_______________________|");

        while(!valido){
            View.texto("ID do motorista:");
            int id = Erros.entradaInt();

            for(Motorista motorista : listMotorista){
                if(motorista.getId() == id){
                    try{
                        MotoristaDAO.excluirMotorista(motorista);
                        valido = true;
                        break;
                    } catch (SQLException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}