package org.example;

class MyBox<T extends Number>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        MyBox<Integer> mybox1 = new MyBox<>();
     // MyBox<String> mybox2 = new MyBox<>(); 위에 클래스에서 제네릭클래스로 타입 인자를 숫자로 제한해서 안댐

    }
}
