package com.icegone.day15;

/**
 * 描述人这个类，并定义功能根据年龄判断是否是同龄人
 * 由于要根据指定类的属性进行比较，这时只要覆盖Object中的equals方法
 * 在方法体中根据类的属性值进行比较
 */
class Person extends Object {
    int age;
    //在复写Object中的equals方法时，一定要注意public boolean equals(Object obj)的参数是Object类型，在调用对象的属性时，一定要进行类型转换，在转换之前必须进行类型判断。
    public boolean equals(Object obj) {
        //判断当前调用equals方法的对象和传递进来的对象是否是同一个
        if (this == obj) {
            return true;
        }
        //判断传递进来的对象是否是Person类型
        if (!(obj instanceof Person)) {
            return false;
        }
        //将obj向下转型为Perosn引用，访问其属性
        Person p = (Person) obj;
        return this.age == p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p =new Person();
        new Person().equals(p);
    }
}
