package com.nt.test;

import com.nt.basic.MyRunnable;

public class MyRunnableTest {
	public static void main(String[] args) {
      MyRunnable r=new MyRunnable();
      Thread t=new Thread(r);
      t.start();
	}
}
