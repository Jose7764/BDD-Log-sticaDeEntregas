package org.example.model;

public class Pedido {

    private int id;
    private int idCliente;
    private String data_pedido;
    private double volume_m3;
    private double peso_kg;
    private status_enum status;

    public enum status_enum{
        Pendente, Entregue, Cancelado
    }

    public Pedido(int id, int idCliente, String data_pedido, double volume_m3, double peso_kg, status_enum status) {
        this.id = id;
        this.idCliente = idCliente;
        this.data_pedido = data_pedido;
        this.volume_m3 = volume_m3;
        this.peso_kg = peso_kg;
        this.status = status;
    }

    public Pedido(status_enum status, double peso_kg, double volume_m3, String data_pedido, int idCliente) {
        this.status = status;
        this.peso_kg = peso_kg;
        this.volume_m3 = volume_m3;
        this.data_pedido = data_pedido;
        this.idCliente = idCliente;
    }

    public status_enum getStatus() {
        return status;
    }

    public double getPeso_kg() {
        return peso_kg;
    }

    public double getVolume_m3() {
        return volume_m3;
    }

    public String getData_pedido() {
        return data_pedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setData_pedido(String data_pedido) {
        this.data_pedido = data_pedido;
    }

    public void setVolume_m3(double volume_m3) {
        this.volume_m3 = volume_m3;
    }

    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }

    public void setStatus(status_enum status) {
        this.status = status;
    }
}
