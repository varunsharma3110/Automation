package com.snapdeal.maven;

/**
 * Created by varun on 23/10/16.
 */
class Base {

    public void method() {
        System.out.println("base");
    }
}

class Derived extends Base {

    public void method() {
        System.out.println("derived");
    }
}

public class Inheretance {

    public static void main(String[] args) {
        Derived d = new Derived();
        d.method();
    }
}
