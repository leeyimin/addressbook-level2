package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_GOODBYE;
import static seedu.addressbook.common.Messages.MESSAGE_INIT_FAILED;
import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_USING_STORAGE_FILE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

import java.util.List;

public class Formatter {
	
    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";
    
    /** Offset required to convert between 1-indexing and 0-indexing.  */
    public static final int DISPLAYED_INDEX_OFFSET = 1;
	
    /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";
    
    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";
    
    public static String formatLine(String toPrint){
    	return LINE_PREFIX + toPrint.replace("\n", LS + LINE_PREFIX);
    }
    
    public static String addDividerAtEnd(String toPrint){
    	return toPrint + DIVIDER;
    }

	public static String[] getWelcomeMessageArray(String version, String storageFilePath) {
		String[] array= {DIVIDER, DIVIDER, MESSAGE_WELCOME, version, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE,
				String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath), DIVIDER};
		return array;
	}
	
	public static String[] getMessageArray(String message){
		String[] array= {message, DIVIDER, DIVIDER};
		return array;
	}
	
	public static String[] getInitFailedMessageArray(){
		String[] array= {MESSAGE_INIT_FAILED, DIVIDER, DIVIDER};
		return array;	
	}
	
	public static String[] getResultMessageArray(String result){
		String[] array= {result, DIVIDER};
		return array;	
	}
	
    /** Formats a list of strings as a viewable indexed list. */
    protected static String getIndexedListForViewing(List<String> listItems) {
        final StringBuilder formatted = new StringBuilder();
        int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
        for (String listItem : listItems) {
            formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
            displayIndex++;
        }
        return formatted.toString();
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }

}
