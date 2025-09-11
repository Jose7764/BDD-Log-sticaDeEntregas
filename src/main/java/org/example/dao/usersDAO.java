package org.example.dao;

import org.example.model.*;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usersDAO {

    public void cadatrarCliente(Cliente cliente) throws SQLException {
        String query = """
                    INSERT INTO Cliente 
                    (nome, cpf_cnpj, endereco, cidade, estado) 
                    VALUES (?, ?, ?, ?, ?)
                    """;

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getCidade());
            stmt.setString(5, cliente.getEstado());
            stmt.executeUpdate();

            System.out.println("||             Cliente Cadastrado com Sucesso!               ||");

        }
    }

    public void cadastrarMotorista(Motorista motorista) throws SQLException{
        String query = """
                INSERT INTO Motorista
                ( nome , cnh , veiculo, cidade_base)
                VALUES(?, ?, ?, ?)
                """;

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, motorista.getNome());
            stmt.setString(2, motorista.getCnh());
            stmt.setString(3, motorista.getVeiculo());
            stmt.setString(4, motorista.getCidade_base());
            stmt.executeUpdate();

            System.out.println("||             Motorista Cadastrado com Sucesso!             ||");

        }
    }





}
