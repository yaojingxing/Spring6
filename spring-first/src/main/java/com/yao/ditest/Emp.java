package com.yao.ditest;

public class Emp {
    private String ename;
    private Integer age;

    //对象类型属性
    private Dept dept;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }



    public void work(){
        System.out.println(ename+ "emp work....."+age );
    }
}
