package com.itheima.homework.answer6;

import java.util.Objects;

public class Product {
    private String store;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product commodity = (Product) o;
        return Objects.equals(store, commodity.store) && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product() {
    }

    public Product(String store, String name) {
        this.store = store;
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "商店名" + store  +
                ", 商品名" + name ;
    }
}
