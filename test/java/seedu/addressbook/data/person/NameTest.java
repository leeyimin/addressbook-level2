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
		} catch (IllegalValueException e) {
			e.printStackTrace();
		}
		
	}

}
