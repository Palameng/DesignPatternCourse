package com.mengyuan.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {
        Meng meng1 = new Meng();
        meng1.studyJavaCourse();
        meng1.studyPythonCourse();

        System.out.println("-----------------------------------");

        Meng meng2 = new Meng(new JavaCourse());
        meng2.studyOnlineCourse();

        meng2 = new Meng(new PythonCourse());
        meng2.studyOnlineCourse();

        System.out.println("-----------------------------------");

        Meng meng3 = new Meng();
        meng3.setiCourse(new JavaCourse());
        meng3.studyOnlineCourse();
        meng3.setiCourse(new PythonCourse());
        meng3.studyOnlineCourse();

    }
}
