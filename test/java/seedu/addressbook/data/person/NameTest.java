package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.tag.UniqueTagList;

public class NameTest {

	@Test
	public void testIsSimilar() {
		try {
			Name name = new Name("John K Smith");
			assertTrue(name.isSimilar(new Name("John K Smith")));
			assertTrue(name.isSimilar(new Name("john k smith")));
			assertTrue(name.isSimilar(new Name("k smith")));
			assertFalse(name.isSimilar(new Name("Putin pudding")));
			assertFalse(name.isSimilar(new Name("smith brown")));
			assertFalse(name.isSimilar(null));
			
			name = new Name("Johnson Johnson");
			assertTrue(name.isSimilar(new Name("Johnson Johnson")));
			name = new Name("John Smith");
			assertTrue(name.isSimilar(new Name("John")));
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
		
	}

}
