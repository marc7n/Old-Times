package pl.coderslab.OldTimes.entity;

import javax.persistence.*;

@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", picture='" + picture + '\'' +
                '}';
    }
}




