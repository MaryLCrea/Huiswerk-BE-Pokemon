public abstract class Pokemon{
private String name;
private int level;
private String type;

public Pokemon (String name, int level) {
    this.name = name;
    this.level = level;

}
public void setType(String type) {
    this.type = type;

}
public String getType() {
      return type;
}
public void setName(String name) {
        this.name = name;

}
public String getName() {
        return name;
}
public void setLevel(int level) {
        this.level = level;

}
public int getLevel() {
        return level;
}

}

