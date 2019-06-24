package com.yt.reflect;

import java.lang.reflect.Constructor;

/**
 * @Description:
 * Class.newInstance() 的使用有严格的限制，那就是一个 Class 对象中，必须存在一个无参数的 Constructor，并且这个 Constructor 必须要有访问的权限
 * 通过 Constructor.newInstance() 却没有这种限制。
 * Constructor.newInstance() 适应任何类型的 Constructor,无论它们有参数还是无参数，只要通过 setAccessible() 控制好访问权限就可以了。
 * 所以，一般建议优先使用 Constructor.newInstance() 去创建一个对象实例
 * @Author : Tong.Yang11@geely.com
 * @Date : 2019/05/29 15:43
 */
public class NewInstanceClass {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class<TestClass> clazz = TestClass.class;

        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor = " + constructor);
        }

        TestClass obj = clazz.newInstance();


        System.out.println(obj.toString());
    }
}


class TestClass {

    private String name;

    public TestClass() {
    }

    public TestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}