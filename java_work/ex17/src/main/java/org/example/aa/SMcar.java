package org.example.aa;


public class SMcar extends Car {

    public SMcar(){}

    public SMcar(String name, String decs, String company){
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
        return "SMcar{" +
                "name='" + name + '\'' +
                ", decs='" + decs + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
