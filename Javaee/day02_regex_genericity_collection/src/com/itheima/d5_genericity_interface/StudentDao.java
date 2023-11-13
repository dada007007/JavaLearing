package com.itheima.d5_genericity_interface;

public class StudentDao  implements Data<Student>{
    @Override
    public void add(Student student) {
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public Student getById(int id) {
        return null;
    }
}
