// Frank Chen
// APCS1 pd1
// HW46 -- AL<B> Sorted!
// 2017-12-04

import java.util.ArrayList;

public class ALTester {

	// Instance Var
	private ArrayList<Comparable> array;

    // Constructor
    public ALTester() {
		array = new ArrayList<Comparable>();
    }
	
	// toString
	public String toString() {
		return array.toString();
	}	
	
	// Size
	public int size() {
		return array.size();
	}
	
	// Get Index
	public Comparable get (int index) {
		return array.get(index);
	}
	
	// Add Value Into Index
	public void populate (Comparable value) {
		for (int i = 0; i < array.size(); i++) {
			if ( (value.compareTo( array.get(i) )) < 0) {
				array.add(i, value);
				return;
			}
		}
		array.add(value);
	}
	
	//Main Method
    public static void main (String[] args) {
		ALTester list0 = new ALTester();
		ALTester list1 = new ALTester();
		ALTester list2 = new ALTester();
		for (int i = 0; i < 23; i++) {
			list0.populate0(i);
			list1.populate1(i);
			list2.populate2(i);
		}
		System.out.print(list0);
		System.out.print(list1);
		System.out.print(list2);
		
    }
    
}