package com.mengyuan.design.principle.singleresponsibility;

public interface ICourse {
    // 课程内容获取
    String getCourseName();
    byte[] getCourseVideo();

    // 课程管理
    // 学习课程--使用到获取课程名字和视频
    void studyCourse();

    // 退课，此时如果执行了退课操作，那么通过该接口获取课程内容很可能会达不到预想的结果
    void refundCourse();
}
