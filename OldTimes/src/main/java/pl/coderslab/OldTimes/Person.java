package pl.coderslab.OldTimes;

public class Person {
    private int id;
    private String period;
    private String socialStatus;
    private String sex;

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

