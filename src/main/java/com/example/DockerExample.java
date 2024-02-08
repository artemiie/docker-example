package com.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dockerexample_table")
public class DockerExample {
    @Id
    private Long id;
    @Column(name = "title")
    private String title;

    public DockerExample() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DockerExample{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
