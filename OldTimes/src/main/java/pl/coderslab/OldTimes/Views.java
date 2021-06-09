package pl.coderslab.OldTimes;

public class Views {
    private int id;
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
    public String  toString() {
        return "Views{" +
                "id=" + id +
                ", image='" + image + '\'' +
                '}';
    }
}
