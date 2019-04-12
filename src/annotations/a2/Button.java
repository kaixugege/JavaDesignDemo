package annotations.a2;

public class Button {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Button(String name, int id) {
        this.name = name;
        this.id = id;
    }

    String name;

    int id;
    public String show(){
        return name + id;
    }

}
