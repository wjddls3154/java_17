package org.opentutorials.javatutorials.accessmodifier.inner;

class A {

    public String y(){    // public 은 누구든지 호출해서 사용가능
        return "public void y()";
    }

    private String z() {   // privvate 은 클래스 내부에서만 사용가능
        return  "public void z()";
    }

    public String x() {
        return z();
    }

}

/**
 * 여기서 public, private 이 접근제어자.
 */


public class AccessDemo1 {

    public static void main(String[] args){

        A a = new A();
        System.out.println(a.y());

        //System.out.println(a.z()); 는 오류가 발생한다 , 그 이유는 z()는 위 클래스 A에서 private 로 지정했기 때문에 자기클래스안에서만 사용이가능하다.

        System.out.println(a.x()); // x 메소드는 z 메소드와 같은 클래스이기때문에 호출이 가능하다.

    }

}
