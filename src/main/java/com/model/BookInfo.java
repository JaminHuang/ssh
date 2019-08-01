package com.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "BookInfo", schema = "javadb")
public class BookInfo {

    private String BookId;
    private String BookName;
    private BigDecimal Price;
    private Date UpdateTime;

    @Id
    @Column(name = "BookId", unique = true, nullable = false, length = 20)
    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        this.BookId = bookId;
    }

    @Column(name = "BookName", nullable = false, length = 200)
    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    @Column(name = "Price", nullable = false, length = 8)
    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        this.Price = price;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UpdateTime", nullable = false, length = 7)
    public Date getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(Date updateTime) {
        UpdateTime = updateTime;
    }
}
