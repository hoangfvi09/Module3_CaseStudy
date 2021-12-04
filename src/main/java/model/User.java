package model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private int sole;
    private String image;

    public User() {
    }

    public User(int id, String name, String email, String password, int sole, String image) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.sole = sole;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSole() {
        return sole;
    }

    public void setSole(int sole) {
        this.sole = sole;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
