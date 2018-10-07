package com.mengyuan.design.principle.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("meng 正在学习Python");
    }
}
