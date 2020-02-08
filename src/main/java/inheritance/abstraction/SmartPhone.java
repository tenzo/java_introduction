package inheritance.abstraction;

public class SmartPhone implements Computer, Phone {

    @Override
    public void sendEmail(String address, String content) {
        System.out.println("Sending email " + content + " to address " + address + " using SmartPhone");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing Internet using SmartPhone");
    }

    @Override
    public void sendSms(int number, String content) {
        System.out.println("Sending sms to " + number + " with content " + content + " using SmartPhone");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + " using SmartPhone");
    }
}
