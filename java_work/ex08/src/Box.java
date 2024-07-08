public class Box {

    public String name;

    public void setName(String n){
        name = n ;
    }

    public  String toStrng(){
        return "box { name " + name + "}";
    }


    public String toString() {
        return "Box{" +
                "name='" + name + '\'' +
                '}';
    }
}
