package org.example;

public class Box<T> {

    private T  obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}


// const obj = {  a: function(){}
//                b: function(){}
//                c: 100};   **자바스크립트에서는 이런식으로 씀**
// const obj = new Object(;)