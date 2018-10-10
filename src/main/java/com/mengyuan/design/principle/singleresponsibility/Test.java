package com.mengyuan.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");

        // 鸵鸟并不会飞，所以普通做法是修改 mainMoveMode方法里加入判断
        bird.mainMoveMode("鸵鸟");

        //----------------------------------------------------
        System.out.println("-------------------------------------");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
