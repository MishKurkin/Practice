package Object_Oriented;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Bobik", "Bobikmail@gmail.com", "male");
        System.out.println(a.getGender());
        System.out.println(a.getEmail());
        System.out.println(a.getName());
    }
}
