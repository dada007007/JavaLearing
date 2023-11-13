package com.itheima.d5_genericity_interface;
// 自定义泛型接口
public interface Data<T> {
    void add(T t);
    boolean delete(T t);
    boolean update(T t);
    T getById(int id);
}
