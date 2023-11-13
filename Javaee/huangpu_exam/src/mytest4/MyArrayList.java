package mytest4;

import java.util.Arrays;

public class MyArrayList<E> {
    private Object[] elementData = {};
    private int size;
    private int DEFAULT_CAPACITY = 10;

    public boolean add(E e){
        // 1、判断是否需要扩容
        if(size==elementData.length){
            grow();
        }
        elementData[size++] = e;
        return true;
    }

//    public E get(int index){
//        // 做越界判断。
//    }


    /**
    * 扩容
    * */
    private void grow() {
        if(size == 0){
            elementData = new Object[DEFAULT_CAPACITY];
        }else {
            // 后几次扩容;移位运算符变成原来的1.5倍
            elementData = Arrays.copyOf(elementData,elementData.length +elementData.length >>1);
        }
    }

}
