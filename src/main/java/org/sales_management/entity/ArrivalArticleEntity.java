package org.sales_management.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "arrival_articles")
public class ArrivalArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int quantity;
    private LocalDateTime arrivalDate;
    @ManyToOne
    @JoinColumn(name = "arrival_id")
    private ArrivalEntity arrival;
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

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public ArrivalEntity getArrival() {
        return arrival;
    }

    public void setArrival(ArrivalEntity arrival) {
        this.arrival = arrival;
    }

    public ArticleEntity getArticle() {
        return article;
    }

    public void setArticle(ArticleEntity article) {
        this.article = article;
    }

}