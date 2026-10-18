package com.java;


class garbage{
	int x = 100;
}
public class GarbageC {
	 private int x;

	 public static void main(String[] args) {
		 GarbageC c = new GarbageC();
		 c = null;
		 c.x=100;
		 System.out.println(c.x);

	}

}
