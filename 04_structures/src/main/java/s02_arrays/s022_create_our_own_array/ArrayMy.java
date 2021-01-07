package s02_arrays.s022_create_our_own_array;

/**
 * @program: learning
 * @description: 数组练习
 * @author: bjchen
 * @create: 2021-01-07
 **/
public class ArrayMy {
    private int [] data;
    private int size;
    //默认空参构造
    public ArrayMy(){
        //给定默认容量，初始化
        this(10);
    }
    //给定初始容量
    public ArrayMy(int capacity){
        data =new int[capacity];
        size =0;
    }
    //获取容量
    public int getCapacity(){
        return data.length;
    }
    //获取size
    public int getSize(){
        return size;
    }
    //判空
    public boolean isEmpty(){
        return size == 0;
    }

}
