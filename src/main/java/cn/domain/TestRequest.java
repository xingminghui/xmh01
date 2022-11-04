package cn.domain;

public class TestRequest {
    private String name;
    private String level;

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "TestRequest{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
