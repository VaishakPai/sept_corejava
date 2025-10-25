package com.vtech.associations.aggregation.task25102025;

public class HumanRunner {
    public static void main(String[] args) {
        Iphone phone = new Iphone("iPhone 17 Pro Max");
        Human human = new Human(phone);
        human.live();
    }
}
