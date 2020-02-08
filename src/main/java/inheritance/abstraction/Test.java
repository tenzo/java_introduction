package inheritance.abstraction;

public class Test {

    public static void main(String[] args) {
        Nokia3310 nokia = new Nokia3310(5);
        nokia.makeCall(555444333);
        nokia.sendSms(555444333, "Cześć Maciek co słychać?");
        nokia.playSnake();
        Computer pc = new PC();
        pc.browseInternet();
        pc.sendEmail("halina@example.com", "Cześć Halina, podeślesz ten ostatni przepis?");

        SmartPhone smartPhone3 = new SmartPhone();
        Phone smartPhone = smartPhone3;
        smartPhone.sendSms(23423534, "Hello Kitty!");
        smartPhone.makeCall(4353645);

        Computer smartPhone2 = smartPhone3;
        smartPhone2.sendEmail("harnas@example.com", "Cześć zbóju!");
        smartPhone2.browseInternet();


    }
}
