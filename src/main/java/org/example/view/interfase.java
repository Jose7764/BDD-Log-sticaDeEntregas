package org.example.view;

import java.time.LocalDate;
import java.util.Scanner;
import org.example.model.*;

public class interfase {

    public static Scanner input = new Scanner(System.in);
    Cliente cliente;
    Motorista motorista;
    Pedido pedido;

    public int menuPrincipal(){

        System.out.println("||===========================================================||");
        System.out.println("||                    Logistica de Entregas                  ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Cadastrar                                              ||");
        System.out.println("|| 2. Listar                                                 ||");
        System.out.println("|| 3. Remover/Cancelar                                       ||");
        System.out.println("|| 4. Relatorios                                             ||");
        System.out.println("|| 5.                                                        ||");
        System.out.println("|| 6.                                                        ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public int menuCadastrar(){
        System.out.println("||===========================================================||");
        System.out.println("||                     Menu de Cadastro                      ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Cliente                                                ||");
        System.out.println("|| 2. Motorista                                              ||");
        System.out.println("|| 3. Pedido                                                 ||");
        System.out.println("||                                                           ||");
        System.out.println("||                                               0. Voltar   ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public int menuListar(){
        System.out.println("||===========================================================||");
        System.out.println("||                     Menu de Listar                        ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Entregas com Cliente e Motorista                       ||");
        System.out.println("|| 2. Cliente                                                ||");
        System.out.println("|| 3. Historico Entrega                                      ||");
        System.out.println("||                                                           ||");
        System.out.println("||                                               0. Voltar   ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public int menuRemover(){
        System.out.println("||===========================================================||");
        System.out.println("||                     Menu de Remover                       ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Entregas                                               ||");
        System.out.println("|| 2. Cliente                                                ||");
        System.out.println("|| 3. Motorista                                              ||");
        System.out.println("|| 4. Pedido                                                 ||");
        System.out.println("||                                                           ||");
        System.out.println("||                                               0. Voltar   ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public int menuRelatorio (){
        System.out.println("||===========================================================||");
        System.out.println("||                     Menu de Relatorio                     ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Total de Entregas por Motorista                        ||");
        System.out.println("|| 2. Clientes com Maior Volume Entregue                     ||");
        System.out.println("|| 3. Pedidos Pendentes por Estado                           ||");
        System.out.println("|| 4. Entregas Atrasadas por Cidade                          ||");
        System.out.println("||                                                           ||");
        System.out.println("||                                                0. Voltar  ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public Cliente cadastrarCliente (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o nome do Cliente:                               ||");
        System.out.print("|| - ");
        String nome = input.nextLine();

        System.out.println("|| - Digite o CPF do Cliente:                                ||");
        System.out.print("|| - ");
        String cpf = input.nextLine();

        System.out.println("|| - Digite o endereco do Cliente:                           ||");
        System.out.print("|| - ");
        String endereco = input.nextLine();

        System.out.println("|| - Digite o cidade do Cliente:                             ||");
        System.out.print("|| - ");
        String cidade = input.nextLine();

        System.out.println("|| - Digite o Estado do Cliente:                             ||");
        System.out.print("|| - ");
        String estado = input.nextLine();
        System.out.println("||===========================================================||");

        cliente = new Cliente(nome , cpf , endereco, cidade, estado);

        return cliente;
    }

    public Motorista cadastrarMotorista (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o nome do Motorista:                             ||");
        System.out.print("|| - ");
        String nome = input.nextLine();

        System.out.println("|| - Digite o CNH do Motorista:                              ||");
        System.out.print("|| - ");
        String cnh = input.nextLine();

        System.out.println("|| - Digite o veiculo do Motorista:                          ||");
        System.out.print("|| - ");
        String veiculo = input.nextLine();

        System.out.println("|| - Digite o cidade base do Motorista:                      ||");
        System.out.print("|| - ");
        String cidade = input.nextLine();
        System.out.println("||===========================================================||");

        motorista = new Motorista(nome , cnh , veiculo, cidade);

        return motorista;
    }

    public Pedido cadastrarPedido() {
        System.out.println("||===========================================================||");

        System.out.println("|| - Digite o ID do Cliente do Pedido                       ||");
        System.out.print("|| - ");
        int idCliente = Integer.parseInt(input.nextLine());

        System.out.println("|| - Digite a data do pedido (yyyy-MM-dd):                 ||");
        System.out.print("|| - ");
        String dataString = input.nextLine();
        LocalDate dataPedido = LocalDate.parse(dataString);

        System.out.println("|| - Digite o volume do pedido (m³):                       ||");
        System.out.print("|| - ");
        double volume = Double.parseDouble(input.nextLine());

        System.out.println("|| - Digite o peso do pedido (kg):                          ||");
        System.out.print("|| - ");
        double peso = Double.parseDouble(input.nextLine());

        System.out.println("|| - Digite o status do pedido (PENDENTE, ENTREGUE, CANCELADO): ||");
        System.out.print("|| - ");
        String statusString = input.nextLine().toUpperCase();
        Pedido.StatusEnum status = Pedido.StatusEnum.valueOf(statusString);

        System.out.println("||===========================================================||");

        Pedido pedido = new Pedido(idCliente, dataPedido, volume, peso, status);

        return pedido;
    }





}
