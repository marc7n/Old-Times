package pl.coderslab.OldTimes.entity;

import javax.persistence.*;

@Entity
@Table(name = "person")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "period")
    private String period;
    @Column(name = "social_status")
    private String socialStatus;
    @Column(name = "sex")
    private String sex;
    @OneToOne
    private View view;

    public Person() {
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Person(int id, String period, String socialStatus, String sex) {
        this.id = id;
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
    }

    public Person(String period, String socialStatus, String sex) {
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
    }

    public Person(int id, String period, String socialStatus, String sex, View view) {
        this.id = id;
        this.period = period;
        this.socialStatus = socialStatus;
        this.sex = sex;
        this.view = view;
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
                '}';
    }
}

