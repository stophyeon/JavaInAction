package org.example.Sync;

public class Sync {
    private final String name;


    public Sync(String name) {
        this.name = name;
    }
    public void call_1(){
        System.out.println(this.name+"의 1번째 전화");
    }
    public void call_2(){
        System.out.println(this.name+"의 2번째 전화");
    }
    public void call_3(){
        System.out.println(this.name+"의 3번째 전화");
    }
}
