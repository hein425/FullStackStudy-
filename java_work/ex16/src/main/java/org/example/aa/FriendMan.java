package org.example.aa;
//기본생성자는 다른 생성자를 선언하게 되면 생략 불가

//상속관계에서는 부모클래스 생성자는 무조건 호출되어져야 한다. 기본이든 다른거든.

//상속관계에서는 기본생성자를 호출하는게 있는데 <- 이게 생략되어져 있습니다.
//만약 부모클래스에 기본생성자가 선언되어져 있지 않을때는
// ㄴ다른 생성자 호출을 통해 부모클래스 생성자를 호출할수 있다.
public class FriendMan extends Man{
    private String place;

    public FriendMan(String name){
        super(name);
    }

}
