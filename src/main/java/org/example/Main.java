package org.example;

import org.example.view.interfase;
import org.example.service.Logistica;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        interfase view = new interfase();
        Logistica service = new Logistica();

        while (true){
           int opcao = view.menuPrincipal();

           service.tratarMenus(opcao);

           if(opcao == 0){
               break;
           }

        }

    }
}