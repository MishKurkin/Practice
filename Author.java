package Object_Oriented;

public class Author {
    private String name;
    private String email;
    public String gender;
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public String getGender() {
        return gender;
    }

    public String toString(){
        System.out.println("Name: " + name + "(" + gender + ")" + "at" + email);
        return "";
    }
}
