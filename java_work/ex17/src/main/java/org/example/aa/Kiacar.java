package org.example.aa;


public class Kiacar extends Car {

    public Kiacar(){}

    public Kiacar(String name, String decs, String company){
        this.name=name;
        this.decs=decs;
        this.company=name;
    }

    public void show() {
        System.out.println(
                name + "" +
                decs + "" +
                company
        );
    }

    @Override
    public String toString() {
        return "Kiacar{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}