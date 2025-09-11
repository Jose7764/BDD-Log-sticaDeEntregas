package org.example.service;

import org.example.Main;
import org.example.view.interfase;
import org.example.dao.*;
import org.example.model.*;

import java.sql.SQLException;


public class Logistica {

    interfase view = new interfase();
    usersDAO users_DAO = new usersDAO();
    gestaoDAO gestao_DAO = new gestaoDAO();

    Cliente cliente;
    Motorista motorista;
    Pedido pedido;

    public void tratarMenus(int opcao) throws SQLException {

        switch (opcao){

            case 1: // Menu Principal Cadastro //

                int opcaoCadastro = view.menuCadastrar();


                switch (opcaoCadastro){ // Opcoes Cadastro //

                    case 1:
                        cliente = view.cadastrarCliente();

                        users_DAO.cadatrarCliente(cliente);

                        break;

                    case 2:
                        motorista = view.cadastrarMotorista();

                        users_DAO.cadastrarMotorista(motorista);
                        break;

                    case 3:

                        pedido = view.cadastrarPedido();

                        gestao_DAO.cadastrarPedido(pedido);

                        break;

                    case 0:
                        Main.main(new String[]{});
                        break;
                }

                break;

            case 2: // Menu Principal Listar //

                int opcaoListar = view.menuListar();

                switch (opcaoListar){ // Opcoes Listar //

                    case 0:
                        Main.main(new String[]{});
                        break;
                }

                break;

            case 3: // Menu Principal Remover/Cancelar //

                int opcaoRemover = view.menuRemover();

                switch (opcaoRemover){ // Opcoes Remover //

                    case 0:
                        Main.main(new String[]{});
                        break;
                }

                break;

            case 4: // Menu Principal Relatorios //

                int opcaoRelatorio = view.menuRelatorio();

                switch (opcaoRelatorio){ // Opcoes Relatorios //

                    case 0:
                        Main.main(new String[]{});
                        break;
                }

                break;

        }

    }

}
