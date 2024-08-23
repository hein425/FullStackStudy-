package org.example;
// 스태틱 네스티드 클래스

// 이너 클래스의 구분
// 클래스 안의 변수는 멤버변수
// 함수 안의 변수는 지역(로컬)변수
// 익명변수도 있슴 <= 이게뭐지
// 실무에서는 이거 잘 안쓰고 람다식으로 인자전달 함.
public class Main {
    public static void main(String[] args) {

        MemberDto.MemberReqDto  memberReqDto
                = new MemberDto.MemberReqDto("홍길동",20);

        System.out.println(memberReqDto);


        MemberDto.MemberResDto memberResDto
                = new MemberDto.MemberResDto("정해인",29);

        System.out.println(memberResDto);

    }
}