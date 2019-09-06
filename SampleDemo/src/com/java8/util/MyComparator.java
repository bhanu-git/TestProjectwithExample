package com.java8.util;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
	
	public int compare(Integer i1, Integer i2) {
		
		return (i1<i2)?1:(i1>i2)?-1:0;
		
		/*if(i1<i2) {
			return 1;
		}else if(i1>i2) {
			return -1;
		}else if (i1==i2) {
			return 0;
		}
		return 0;*/
	}

}
