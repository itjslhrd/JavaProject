package com.mnu.exam01;

class Singleton{
    private static Singleton instance = null;
    private int count = 0;
    private Singleton() {}
    public static Singleton getInstance() {
       if(instance == null) {
          instance = new Singleton();
          return instance;
       }
       return instance;
   }
   public void count() {
      count++;
   }
   public int getCount() {
      return count;
   }
}
