import java.util.ArrayList;

public class MobilePhone {
    // Khai báo số điện thoại
    private String myPhone;

    // myContacts chứa danh bạ
    private ArrayList<Contact> myContacts;

    // Hàm khởi tạo đối tượng
    public  MobilePhone(String myPhone) {
        this.myPhone = myPhone;
        this.myContacts = new ArrayList<Contact>();
    }

    // Thêm 1 liên hệ mới vào danh bạ myContacts
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    // Thay đổi liên hệ bằng 1 liên hệ khác
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " is not found");
            return false;
        }
        myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    // Tìm kiếm xem liên hệ đã tồn tại trong danh bạ hay chưa
    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // Tìm kiếm tên liên lạc đã tồn tại trong danh bạ hay chưa
    public int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // Tìm kiếm 1 liên hệ
    public String queryContact(Contact contact){
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    // Xóa 1 liên hệ
    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        myContacts.remove(position);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }
}
