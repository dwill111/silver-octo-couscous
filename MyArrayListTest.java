import static org.junit.Assert.*;

import org.junit.Test;

public class MyArrayListTest {

	@Test
	public void testConstructorAndInitialCapacity() throws Exception {
		MyArrayList<String> testArray = new MyArrayList<String>();
		assertEquals(10, testArray.getInitialCapacity());

		int capacity = 3;
		MyArrayList<String> testArray2 = new MyArrayList<String>(capacity);
		assertEquals(capacity, testArray2.getInitialCapacity());
	}

	@Test
	public void testAddGetSize() throws Exception {
		MyArrayList<Integer> integerArray = new MyArrayList<Integer>(3);
		assertEquals(0, integerArray.size());
		
		Integer integer = new Integer(3);
		integerArray.add(integer);
		assertEquals(1, integerArray.size());
		assertEquals(0, integerArray.indexOf(integer));

		Integer integer2 = new Integer(6);
		integerArray.add(integer2);
		assertEquals(2, integerArray.size());
		assertEquals(1, integerArray.indexOf(integer2));
		
		Integer integer3 = new Integer(9);
		integerArray.add(integer3);
		assertEquals(3, integerArray.size());
		assertEquals(2, integerArray.indexOf(integer3));
		
		integerArray.add(12);
		integerArray.add(15);
		integerArray.add(18);
		integerArray.ensureCapacity();
		assertEquals(12, integerArray.size());
	}

	@Test
	public void testAdd() throws Exception {
		MyArrayList<Integer> integerArray = new MyArrayList<Integer>();
		Integer integer = new Integer(13);
		try {

			integerArray.add(0, 10);
			integerArray.add(1, 11);
			integerArray.add(2, 12);
			integerArray.add(3, integer);
			assertEquals(4, integerArray.size());

			// you should try to add something that will be out of bounds
			// array.add(7, integer(3))
			// fail("IndexOutOfBounds weren't thrown");
			integerArray.add(6, 16);
			throw new IndexOutOfBoundsException("The capacity needs to be larger!!!");

		} catch (IndexOutOfBoundsException e) {
			integerArray.ensureCapacity();
		}

		assertEquals(3, integerArray.indexOf(integer));
		Integer integer2 = new Integer(14);
		integerArray.add(4, integer2);
		assertEquals(5, integerArray.size());
		assertEquals(4, integerArray.indexOf(integer2));

		// add something in an index that already has something and see that all
		// the elements
		// to the right shift over to make space
		integerArray.add(1, 15);
		assertEquals(2, integerArray.indexOf(11));
		assertEquals(3, integerArray.indexOf(12));
		assertEquals(4, integerArray.indexOf(integer));
	}

	@Test
	public void testClear() throws Exception {
		MyArrayList<Integer> integerArray = new MyArrayList<Integer>();
		integerArray.add(0, 10);
		integerArray.add(1, 11);
		integerArray.add(2, 12);
		integerArray.add(3, 13);
		integerArray.add(4, 14);
		integerArray.add(5, 15);
		assertEquals(6, integerArray.size());
		integerArray.clear();
		assertEquals(0, integerArray.size());
	}

	@Test
	public void testContains() throws Exception {
		MyArrayList<Integer> integerArray = new MyArrayList<Integer>();
		integerArray.add(0, 10);
		integerArray.add(1, 11);
		integerArray.add(2, 12);
		integerArray.add(3, 13);
		assertEquals(true, integerArray.contains(11));
 
		// test something that is not contained in the arraylist also
		assertEquals(true, integerArray.contains(14));
		assertEquals(true, integerArray.contains(15));

	}

	@Test
	public void testRemoveIndex() throws Exception {
		MyArrayList<String> stringArray = new MyArrayList<String>();
		stringArray.add(0, "Cats");
		stringArray.add(1, "Dogs");
		stringArray.add(2, "Pigs");
		stringArray.add(3, "Horses");
		assertEquals("Pigs", stringArray.removeIndex(2));
		assertEquals("Dogs", stringArray.removeIndex(1));

		// after removing pigs, dogs, and cats, make sure that horses is at
		// index 0 (everything should shift
		// down if you remove an element and there are things in the list after
		// it)
		stringArray.removeIndex(0);
		stringArray.removeIndex(1);
		stringArray.removeIndex(2);
		assertSame(0, stringArray.indexOf("Horses"));
		assertEquals(0, stringArray.indexOf("Horses"));
	}

	@Test
	public void testRemoveObject() throws Exception {
		MyArrayList<String> stringArray = new MyArrayList<String>();
		stringArray.add(0, "Cats");
		stringArray.add(1, "Dogs");
		stringArray.add(2, "Pigs");
		stringArray.add(3, "Horses");
		assertEquals(true, stringArray.removeObject("Dogs"));
		assertEquals(false, stringArray.removeObject("Elephants"));
		assertEquals(true, stringArray.removeObject("Pigs"));

		// test that after removing dogs, everything shifts down
		stringArray.removeObject("Dogs");
		assertEquals(0, stringArray.indexOf("Cats"));
		assertEquals(1, stringArray.indexOf("Pigs"));
		assertEquals(2, stringArray.indexOf("Horses"));

	}

	@Test
	public void testEmptyArrayList() throws Exception {
		MyArrayList<String> stringArray = new MyArrayList<String>(10);
		assertEquals(false, stringArray.isEmpty());
		stringArray.add(0, "Cats");
		stringArray.add(1, "Dogs");
		stringArray.add(2, "Pigs");
		stringArray.add(3, "Horses");
		assertEquals(true, stringArray.isEmpty());

		/// is the list empty at
		/// this point?
		stringArray.clear();
		assertFalse(stringArray.isEmpty());
		assertEquals(true, stringArray.isEmpty());
	}

	@Test
	public void testSet() throws Exception {
		MyArrayList<String> stringArray = new MyArrayList<String>();
		stringArray.add(0, "Cats");
		stringArray.add(1, "Dogs");
		stringArray.add(2, "Pigs");
		stringArray.add(3, "Horses");
		stringArray.add(4, "Cows");
		stringArray.set(2, "piglets");
		assertEquals("Pigs", stringArray.set(2, "piglets"));
	}

	@Test
	public void testEnsureCapacity() throws Exception {
		MyArrayList<String> stringArray = new MyArrayList<String>();
		stringArray.add(0, "Cats");
		stringArray.add(1, "Dogs");
		stringArray.add(2, "Pigs");
		stringArray.add(3, "Horses");
		assertEquals(4, stringArray.size());
		stringArray.add(5, "Cows");
		stringArray.ensureCapacity();
		assertEquals(12, stringArray.size());
		// make sure you test the other add method and see that it also uses
		// ensure capacity
		// (if you are able to add more than the capacity, you are testing that
		// *somehow* your
		// add methods do check to make sure there is enough space and call
		// ensure capacity
	}
}
