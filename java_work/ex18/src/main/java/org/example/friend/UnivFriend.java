package org.example.friend;

public class UnivFriend extends Friends {

    private String major;

    public UnivFriend(String name, String phone, String major) {
        super(name,phone);
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공 = "+major);
    }

    @Override
    public String toString() {
        return "UnivFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
