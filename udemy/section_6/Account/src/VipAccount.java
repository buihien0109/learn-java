public class VipAccount {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipAccount() {
        this("Default Name", 1000, "Default Address");
    }

    public VipAccount(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipAccount (String name, double creditLimit) {
        this(name, creditLimit, "hien@techmaster.vn");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
