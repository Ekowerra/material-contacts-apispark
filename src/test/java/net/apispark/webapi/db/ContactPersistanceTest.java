package net.apispark.webapi.db;

import org.junit.Assert;
import org.junit.Test;

import net.apispark.webapi.representation.Contact;

public class ContactPersistanceTest {

    @Test
    public void add_contact() throws Exception {
    	Contact contact = new Contact();
        Assert.assertEquals(ContactPersistence.INSTANCE.addContact(contact), contact);
    }
    
    @Test
    public void ask_id() throws Exception {
    	Contact contact = new Contact();
    	contact.setId("a11");
    	ContactPersistence.INSTANCE.addContact(contact);
    	Assert.assertEquals(ContactPersistence.INSTANCE.getContact("a1"), contact);
    }
}
