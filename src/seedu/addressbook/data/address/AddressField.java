package seedu.addressbook.data.address;

abstract class AddressField {
	
	protected final String value;
	
	public AddressField(String value){
		this.value=value;
	}
	
	public String getValue(){
		return value;
	}
	
	@Override
	public String toString(){
		return value;
	}
}
