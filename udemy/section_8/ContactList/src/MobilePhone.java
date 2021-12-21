import java.util.ArrayList;

public class MobilePhone {
    // Khai báo số điện thoại
    private String myNumber;

    // myContacts chứa danh bạ
    private ArrayList<Contact> myContacts;

    // Khởi tạo đối tượng MobilePhone
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // Thêm liên hệ mới vào danh bạ
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;

    }

    // Cập nhật liên hệ thành liên hệ mới
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    // Xóa 1 liên hệ
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    // Tìm kiếm liên hệ
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // Tìm hiến liên hệ theo name
    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // Tìm kiếm liên hệ và trả về name của liên hệ đó
    public String queryContact(Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

    // Tìm kiếm liên hệ và trả về về liên hệ đó
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    // In thông tin của tất cả liên hệ trong danh bạ
    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
        }
    }





















}
