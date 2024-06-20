package org.example.tables;

import java.util.Objects;

public class Produtos {
    private int id;
    private double valor;
    private int quantidade;
    private String nome;
    private String descricao;

    public Produtos() {
    }
    
    public Produtos(double valor, int quantidade, String nome, String descricao) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Produtos(int id, double valor, int quantidade, String nome, String descricao) {
        this.id = id;
        this.valor = valor;
        this.quantidade = quantidade;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return id == produtos.id && Double.compare(valor, produtos.valor) == 0 && quantidade == produtos.quantidade && Objects.equals(nome, produtos.nome) && Objects.equals(descricao, produtos.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor, quantidade, nome, descricao);
    }
}
