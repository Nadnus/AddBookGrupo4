package seedu.addressbook.data.person;

public class Contact {
    protected boolean isPrivate;
    @Override
    public int hashCode() {
       return toString().hashCode();
    }
    public boolean isPrivate() {
        return isPrivate;
    }
}
