package pl.coderslab.OldTimes.entity;

import javax.persistence.*;

@Entity
@Table(name = "view")
public class View {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "View{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
