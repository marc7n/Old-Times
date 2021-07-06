package pl.coderslab.OldTimes.entity;

import pl.coderslab.OldTimes.entity.House;
import pl.coderslab.OldTimes.entity.View;

import javax.persistence.*;

@Entity
@Table(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "period")
    private String period;
    @Column(name = "social_status")
    private String socialStatus;
    @Column(name = "sex")
    private String sex;
    @Column(name = "description")
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    private View view;
    @OneToOne(cascade = CascadeType.ALL)
    private House house;

    public Person() {
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Person(int id, String period, String socialStatus, String sex, String description) {
        this.id = id;
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
        this.description = description;
    }

    public Person(String period, String socialStatus, String sex, String description) {
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
        this.description = description;
    }

    public Person(int id, String period, String socialStatus, String sex, String description, View view, House house) {
        this.id = id;
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
        this.description = description;
        this.view = view;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", period='" + period + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", view=" + view +
                ", house=" + house +
                '}';
    }
}

