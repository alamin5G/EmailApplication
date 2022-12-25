package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email email = new Email("Md", "Alamin");
        email.setAlternateEmail("alamin5g@yahoo.com");
        System.out.println("alternative email: "+email.getAlternateEmail());
        email.setMailBoxCapacity(1000);
        System.out.println("Your email Quota: " + email.getMailBoxCapacity() + "MB");
        email.changePassword("252646As@");
        System.out.println("Your new password is: " + email.getPassword());
    }

}
