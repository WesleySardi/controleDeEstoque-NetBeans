package org.example.tables;

import java.sql.Timestamp;
import java.util.Objects;

public class Vendas {
    private int id;
    private String clienteCpf;
    private int produtoId;
    private String produtoNome;
    private int quantidadeVendida;
    private Double valorUnit;
    private Double valorTotal;
    private Timestamp dataVenda;

    public Vendas() {
    }

    public Vendas(String clienteCpf, int produtoId, Double valorUnit, int quantidadeVendida) {
        this.clienteCpf = clienteCpf;
        this.produtoId = produtoId;
        this.valorUnit = valorUnit;
        this.quantidadeVendida = quantidadeVendida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Timestamp getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Timestamp dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.clienteCpf);
        hash = 83 * hash + this.produtoId;
        hash = 83 * hash + Objects.hashCode(this.produtoNome);
        hash = 83 * hash + this.quantidadeVendida;
        hash = 83 * hash + Objects.hashCode(this.valorUnit);
        hash = 83 * hash + Objects.hashCode(this.valorTotal);
        hash = 83 * hash + Objects.hashCode(this.dataVenda);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendas other = (Vendas) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.produtoId != other.produtoId) {
            return false;
        }
        if (this.quantidadeVendida != other.quantidadeVendida) {
            return false;
        }
        if (!Objects.equals(this.clienteCpf, other.clienteCpf)) {
            return false;
        }
        if (!Objects.equals(this.produtoNome, other.produtoNome)) {
            return false;
        }
        if (!Objects.equals(this.valorUnit, other.valorUnit)) {
            return false;
        }
        if (!Objects.equals(this.valorTotal, other.valorTotal)) {
            return false;
        }
        return Objects.equals(this.dataVenda, other.dataVenda);
    }
    
    
}
