package com.yao.ditest;


import java.util.List;

public class Dept {

    private String dname;

    public String getDname() {
        return dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    private List<Emp> empList;
    public Dept(){
        System.out.println(this.getClass()+"无参构造");
    }

    public void info(){
        System.out.println("部门名称："+dname );
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
