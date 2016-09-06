package seedu.addressbook.data.person;

public interface Printable {
	
	public String getPrintableString();

	/**
	  * Returns a concatenated version of the printable strings of each object.
	  */
	public static String getPrintableString(Printable... printables){
		StringBuilder builder = new StringBuilder();
		builder.append(printables[0].getPrintableString());
		for(int i=1;i<printables.length;i++){
			builder.append(", ");
			builder.append(printables[i].getPrintableString());
		}
		return builder.toString();
	}
}
