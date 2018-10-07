package com.mengyuan.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        //ICourse javaCourse = new JavaCourse(96, "Java开发", 348d);
        ICourse iCourse = new JavaDiscountCourse(96, "Java开发", 348d);

        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;

        System.out.println(
                "课程Id："
                + javaCourse.getId() + "\n"
                + "课程名称："
                + javaCourse.getName() + "\n"
                + "课程打折价格："
                + javaCourse.getPrice() + "\n"
                + "课程原价价格:"
                + javaCourse.getOriginPrice() + "\n"
        );
    }
}
