package IntecStudentUser.Model;

public class User_Student {

    protected int id;
    protected String name;
    protected String email;
    protected String comment;

    public User_Student(String name, String email, String comment) {

        this.name = name;
        this.email = email;
        this.comment = comment;
    }


    @Override
    public String toString() {
        return "User_Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                '}';
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public User_Student(int id, String name, String email, String comment) {

    }
}
