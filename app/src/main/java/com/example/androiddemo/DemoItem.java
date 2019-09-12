package com.example.androiddemo;

import com.example.androiddemo.activity.FristDemoActivity;
import com.example.androiddemo.activity.MenuActivity;

public class DemoItem {
    public static DemoItem[] items = {
            new DemoItem("First Activity", FristDemoActivity.class),
            new DemoItem("菜单", MenuActivity.class),
    };
    String name;
    String title;
    Class targetActivity;

    public DemoItem(String title, Class targetActivity) {
        this.title = title;
        this.targetActivity = targetActivity;
    }

}
