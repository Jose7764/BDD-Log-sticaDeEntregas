package org.example.model;

import java.time.LocalDate;

public class Pedido {

    private int id;
    private int idCliente;
    private LocalDate dataPedido;
    private double volumeM3;
    private double pesoKg;
    private StatusEnum status;

    public enum StatusEnum {
        PENDENTE, ENTREGUE, CANCELADO
    }


    public Pedido(int idCliente ,LocalDate dataPedido, double volumeM3, double pesoKg, StatusEnum status) {

        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.volumeM3 = volumeM3;
        this.pesoKg = pesoKg;
        this.status = status;
    }


    public Pedido(int id, int idCliente, LocalDate dataPedido, double volumeM3, double pesoKg, StatusEnum status) {
        this.id = id;
        this.idCliente = idCliente;
        this.dataPedido = dataPedido;
        this.volumeM3 = volumeM3;
        this.pesoKg = pesoKg;
        this.status = status;
    }



    public int getIdCliente() {
        return idCliente;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public double getVolumeM3() {
        return volumeM3;
    }
    public double getPesoKg() {
        return pesoKg;
    }
    public StatusEnum getStatus() {
        return status;
    }



    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
    public void setVolumeM3(double volumeM3) {
        this.volumeM3 = volumeM3;
    }
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
