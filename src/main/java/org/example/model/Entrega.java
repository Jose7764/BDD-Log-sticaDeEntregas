package org.example.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entrega {
    private int id;
    private int pedidoId;
    private int motoristaId;
    private LocalDate dataSaida;
    private LocalDate dataEntrega;
    private StatusEntrega status;


    public enum StatusEntrega {
        EM_ROTA,
        ENTREGUE,
        ATRASADA
    }


    public Entrega(int id, int pedidoId, int motoristaId, LocalDate dataSaida,
                   LocalDate dataEntrega, StatusEntrega status) {
        this.id = id;
        this.pedidoId = pedidoId;
        this.motoristaId = motoristaId;
        this.dataSaida = dataSaida;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }

    public Entrega(int pedidoId, int motoristaId, LocalDate dataSaida, LocalDate dataEntrega, StatusEntrega status) {
        this.pedidoId = pedidoId;
        this.motoristaId = motoristaId;
        this.dataSaida = dataSaida;
        this.dataEntrega = dataEntrega;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPedidoId() { return pedidoId; }
    public void setPedidoId(int pedidoId) { this.pedidoId = pedidoId; }

    public int getMotoristaId() { return motoristaId; }
    public void setMotoristaId(int motoristaId) { this.motoristaId = motoristaId; }

    public LocalDate getDataSaida() { return dataSaida; }
    public void setDataSaida(LocalDate dataSaida) { this.dataSaida = dataSaida; }

    public LocalDate getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(LocalDate dataEntrega) { this.dataEntrega = dataEntrega; }

    public StatusEntrega getStatus() { return status; }
    public void setStatus(StatusEntrega status) { this.status = status; }
}
