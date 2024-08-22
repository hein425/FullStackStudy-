package org.example;

interface Viewable{
    @Deprecated
    public  void showIt(String str);
}

class Viewer implements Viewable{
    @Override
    @SuppressWarnings("deprecation")
    public void showIt(String str){
        System.out.println("str = "+ str);
    }
}


public class Ex06 {
    public static void main(String[] args) {
        Viewer viewer = new Viewer();
        viewer.showIt("경고문구나올까...");
    }
}
// 컬렉션 프레임워크
// 리스트
// 순서가 있는 리스트
// 셋
// 중복허용X
// 맵
// 키와 값이 쌍으로 있는

// 사용해서 컬렉션.소트() 함수를 사용했습니다.
//
//
//
//