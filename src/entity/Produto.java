/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author carine.souza
 */
@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "descricao")
    private String descricao;
    @Column(name = "quantidadeMinima")
    private int quantidadeMinima;
    @Column(name = "quantidadeEstoque")
    private int quantidadeEstoque;
    @Column(name = "valorCusto")
    private double valorCusto;
    @Column(name = "valorVenda")
    private double valorVenda;
    
    @ManyToOne
    @JoinColumn(name = "categoriaProduto_id")
    private CategoriaProduto categoriaProduto;
    
    // =================================
    
    public Produto() {
    }

    public Produto(int id, String descricao, int quantidadeMinima, int quantidadeEstoque, double valorCusto, double valorVenda, CategoriaProduto categoriaProduto) {
        this.id = id;
        this.descricao = descricao;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.categoriaProduto = categoriaProduto;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }
    
    //===============================

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Produto[ id=" + id + " ]";
    }

    
}
