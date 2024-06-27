package tech.yanand.sample.book;

import tech.yanand.flyingmybatis.Column;
import tech.yanand.flyingmybatis.PrimaryKey;

import java.time.LocalDate;

/**
 * The Book Entity
 */
public class Book {

    @Column
    @PrimaryKey
    private Long id;

    @Column
    private String name;

    @Column
    private LocalDate publishDate;

    public Book() { }

    public Book(String name, LocalDate publishDate) {
        this.name = name;
        this.publishDate = publishDate;
    }

    public Book(Long id, String name, LocalDate publishDate) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}