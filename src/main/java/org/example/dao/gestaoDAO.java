package org.example.dao;

import org.example.model.*;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class gestaoDAO {

    public void cadastrarPedido(Pedido pedido) throws SQLException {
        String query = """
            INSERT INTO Pedido
            (cliente_id ,data_pedido, volume_m3, peso_kg, status)
            VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, pedido.getIdCliente());
            stmt.setDate(2, java.sql.Date.valueOf(pedido.getDataPedido()));
            stmt.setDouble(3, pedido.getVolumeM3());
            stmt.setDouble(4, pedido.getPesoKg());
            stmt.setString(5, pedido.getStatus().name().toUpperCase());


            stmt.executeUpdate();
            System.out.println("||             Pedido Cadastrado com Sucesso!             ||");
        }
    }

}
