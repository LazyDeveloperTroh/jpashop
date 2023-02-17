package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    private String director;
    private String isbn;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
