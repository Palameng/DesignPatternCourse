package com.mengyuan.design.principle.dependenceinversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("meng 正在学习Java");
    }
}
