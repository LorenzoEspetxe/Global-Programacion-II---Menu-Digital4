public class Usuario {

    private String id;
    private String username;

    public Usuario(){}

    public Usuario(String id, String username) {
        this.id = id;
        this.username = username;
    }

    // setters

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return username + " / " + id;
    }
}
