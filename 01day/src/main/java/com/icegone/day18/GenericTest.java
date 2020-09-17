package com.icegone.day18;

import java.util.Vector;

public class GenericTest {
  
      public static void main(String[] args) {
          Vector<String > vector =new Vector<String>();
          Box<String> name = new Box<String>("corn");
          System.out.println("name:" + name.getData());
      }
  
  }
 
 class Box<T> {
 
     private T data;
 
     public Box() {
 
     }
 
     public Box(T data) {
         this.data = data;
     }
 
     public T getData() {
         return data;
     }
 
 }