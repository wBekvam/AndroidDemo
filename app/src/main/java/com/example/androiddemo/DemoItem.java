package com.example.androiddemo;

import com.example.androiddemo.activity.FristDemoActivity;

public class DemoItem {
    public static DemoItem[] items = {
            new DemoItem("First Activity", FristDemoActivity.class),
    };
    String name;
    String title;
    Class targetActivity;

    public DemoItem(String title, Class targetActivity) {
        this.title = title;
        this.targetActivity = targetActivity;
    }
}
