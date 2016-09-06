package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private static final String PRINT_FORMAT = "%s %s %s";
	private static final String ADDED_SIGN = "+";
	private static final String DELETED_SIGN = "-";
	
	private final Person person;
	private final Tag tag;
	private final boolean isAdded;
	
	public Tagging(Person person, Tag tag, boolean isAdded){
		this.tag = tag;
		this.person = person;
		this.isAdded = isAdded;
	}
	
	public String toString(){
		String sign = DELETED_SIGN;
		if(isAdded){
			sign = ADDED_SIGN;
		}
		return String.format(PRINT_FORMAT, sign, person.getName(), tag.toString());
	}
	

}
