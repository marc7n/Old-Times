package pl.coderslab.OldTimes.entity;

import javax.persistence.*;

@Entity
@Table
public class Periods {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String ancient;
    @Column
    private String middleAge;
    @Column
    private String renaissance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAncient() {
        return ancient;
    }

    public void setAncient(String ancient) {
        this.ancient = ancient;
    }

    public String getMiddleAge() {
        return middleAge;
    }

    public void setMiddleAge(String middleAge) {
        this.middleAge = middleAge;
    }

    public String getRenaissance() {
        return renaissance;
    }

    public void setRenaissance(String renaissance) {
        this.renaissance = renaissance;
    }

    public Periods() {
    }

    @Override
    public String toString() {
        return "Periods{" +
                "id=" + id +
                ", ancient='" + ancient + '\'' +
                ", middleAge='" + middleAge + '\'' +
                ", renaissance='" + renaissance + '\'' +
                '}';
    }
}
