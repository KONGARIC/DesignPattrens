package MediatorDesignPattren;

public class User {
    private int id;
    private String name;
    private String restarent;
    private String food;

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

    public String getRestarent() {
        return restarent;
    }

    public void setRestarent(String restarent) {
        this.restarent = restarent;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }
}
