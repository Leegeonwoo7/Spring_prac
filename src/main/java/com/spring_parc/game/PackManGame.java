package com.spring_parc.game;

public class PackManGame implements GamingConsole{
    public void up() { System.out.println("up move"); }
    public void down(){
        System.out.println("down move");
    }
    public void right(){ System.out.println("right move"); }
    public void left(){
        System.out.println("left move");
    }
}
