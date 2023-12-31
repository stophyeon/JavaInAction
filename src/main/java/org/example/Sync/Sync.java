package org.example.Sync;

public class Sync {
    private final String name;


    public Sync(String name) {
        this.name = name;
    }
    public String call(){
        return this.name+"가 Owhen에게 전화거는 중";
    }
    public String message(){
        return "Owhen에게 메세진 전송 중";
    }
}
