package org.sales_management.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sale_articles")
public class SaleArticleEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private int quantity;
    private LocalDateTime saleDate;
    @ManyToOne
    @JoinColumn(name = "sale_id")
    private SaleEntity sale;
    @ManyToOne
    @JoinColumn(name = "article_id")
    private ArticleEntity article;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDateTime saleDate) {
        this.saleDate = saleDate;
    }

    public SaleEntity getSale() {
        return sale;
    }

    public void setSale(SaleEntity sale) {
        this.sale = sale;
    }

    public ArticleEntity getArticle() {
        return article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }
}