package com.itheima.d5_genericity_interface;

public class TeacherDao implements Data<Teacher>{
    @Override
    public void add(Teacher teacher) {
    }

    @Override
    public boolean delete(Teacher teacher) {
        return false;
    }

    @Override
    public boolean update(Teacher teacher) {
        return false;
    }

    @Override
    public Teacher getById(int id) {
        return null;
    }
}
