package com.mengyuan.design.principle.openclose;

public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();

    // 假设现在需要做打折, 考虑到不只有JavaCourse实现，可能还有PythonCourse等等这样，这样相当于我们需要在这里增加接口
    // 并且，每个实现类也需要做具体实现
    // Double getDiscountPrice();
}
