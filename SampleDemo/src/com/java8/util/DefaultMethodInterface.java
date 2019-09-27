package com.java8.util;

public interface DefaultMethodInterface {

	default void m1() {
		System.out.println("Default method");
	}
	
	//We shoudl not use Object class methods to as a default mehtod . it is compile time error
	/*default int hashCode() {
		return 1;
	}*/
}
