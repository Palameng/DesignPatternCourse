package com.mengyuan.design.principle.dependenceinversion;

public class Meng {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Meng(){

    }

    public Meng(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void studyJavaCourse(){
        System.out.println("meng 正在学习Java");
    }

    public void studyPythonCourse(){
        System.out.println("meng 正在学习Python");
    }

    // 如果我还要学习其他课程，继续加方法，实际上是一种面向实现的编程
    public void studyGoCourse(){
        System.out.println("meng 正在学习Go");
    }

    public void studyOnlineCourse(){
        iCourse.studyCourse();
    }
}
