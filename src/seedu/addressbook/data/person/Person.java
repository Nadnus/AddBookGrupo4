package seedu.addressbook.data.person;

import java.util.*;

import seedu.addressbook.data.tag.Tag;
import seedu.addressbook.data.tag.Tagging;

/**
 * Represents a Person in the address book.
 * Guarantees: details are present and not null, field values are validated.
 */
public class Person implements ReadOnlyPerson {
    private static int sequence_number = 1;

    public List<Tagging> values = new List<Tagging>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Tagging> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] ts) {
            return null;
        }

        @Override
        public boolean add(Tagging tagging) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Tagging> collection) {
            return false;
        }

        @Override
        public boolean addAll(int i, Collection<? extends Tagging> collection) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> collection) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> collection) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Tagging get(int i) {
            return null;
        }

        @Override
        public Tagging set(int i, Tagging tagging) {
            return null;
        }

        @Override
        public void add(int i, Tagging tagging) {

        }

        @Override
        public Tagging remove(int i) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Tagging> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Tagging> listIterator(int i) {
            return null;
        }

        @Override
        public List<Tagging> subList(int i, int i1) {
            return null;
        }
    };

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private int seqnumber;

    private final Set<Tag> tags = new HashSet<>();

    /**
     * Assumption: Every field must be present and not null.
     */
    public Person(Name name, Phone phone, Email email, Address address, Set<Tag> tags) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.tags.addAll(tags);
        this.seqnumber = sequence_number;
        sequence_number += 1;
        for (Tag t: tags ) {
            Tagging val = new Tagging(true);
            values.add(val);
        }
    }

    /**
     * Copy constructor.
     */
    public Person(ReadOnlyPerson source) {
        this(source.getName(), source.getPhone(), source.getEmail(), source.getAddress(), source.getTags());
    }

    @Override
    public Name getName() {
        return name;
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public Email getEmail() {
        return email;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public Set<Tag> getTags() {
        return new HashSet<>(tags);
    }

    /**
     * Replaces this person's tags with the tags in the argument tag set.
     */
    public void setTags(Set<Tag> replacement) {
        for (Tag t: tags ) {
            values.add(new Tagging(false));
        }
        tags.clear();
        tags.addAll(replacement);
        for (Tag t: tags ) {
            values.add(new Tagging(true));
        }
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof ReadOnlyPerson // instanceof handles nulls
                && this.hasSameData((ReadOnlyPerson) other));
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(name, phone, email, address, tags);
    }

    @Override
    public String toString() {
        return getAsTextShowAll();
    }

}
