package cn.domain.t;

public class Plate<T> {

    private T data;

    public Plate(T data) {
        this.data = data;
    }

    public Plate() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "data=" + data +
                '}';
    }
}
