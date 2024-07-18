package org.example.aa;
//롬복 쓰는거 해봣는데 잘 안된다
//import lombok.AllArgsConstructor;
//import lombok.ToString;
//
//@AllArgsConstructor
//@ToString

public class Box {

    private String conts;

   public Box(String cont){
        this.conts = cont;
   }

    @Override
    public String toString() {
        return "내가 바꾸기 Box{" +
                "conts='" + conts + '\'' +
                '}';
    }
}
