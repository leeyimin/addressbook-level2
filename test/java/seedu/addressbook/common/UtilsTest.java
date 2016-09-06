package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testIsAnyNull() {
		//one valid object
		assertFalse(Utils.isAnyNull(new Integer(1)));
		//one valid object in array
		assertFalse(Utils.isAnyNull((new Object[]{new Integer(1)})));
		//valid array
		assertFalse(Utils.isAnyNull("Testing".toCharArray()));
		//valid chain
		assertFalse(Utils.isAnyNull(1,2,3,4,5,6));
		
		//one null object in array
		assertTrue(Utils.isAnyNull(new Object[]{null}));
		//Uninitialized array
		assertTrue(Utils.isAnyNull(new Object[10]));
		//array with one null object
		assertTrue(Utils.isAnyNull(new Object[]{1,2,3,null,5,6}));
		//chain with one null object
		assertTrue(Utils.isAnyNull(1,2,3,4,5,6,7,null,8));
		
	}
	
	@Test
	public void testElementsAreUnique(){
		//empty collection
		assertTrue(Utils.elementsAreUnique(new ArrayList()));
		//unique characters
		ArrayList<Character> list = new ArrayList<>();
		for(char x: "Testing".toCharArray()){
			list.add(x);
		}
		assertTrue(Utils.elementsAreUnique(list));
		//repeating characters
		for(char x: " eww".toCharArray()){
			list.add(x);
		}
		assertFalse(Utils.elementsAreUnique(list));
		
	}

}
