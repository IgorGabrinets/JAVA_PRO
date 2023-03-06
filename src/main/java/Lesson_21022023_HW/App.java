package Lesson_21022023_HW;

public class App {
    public static void makeCall(Phone model, String s) {
    }

    private static void receiveCall(Phone model, String s) {
    }

    public static void main(String[] args) {

        String[] number = {"45645", "57889876", "56789654", "67890765", "4567890", "8765434", "4567890", "9876543", "6789098", "3456789"};

        TelePhone telePhoneOne = new TelePhone("Alcatel");
        TelePhone telePhoneTwo = new TelePhone("Motorola");

        MobilePhone mobilePhoneOne = new MobilePhone("Huawei");
        MobilePhone mobilePhoneTwo = new MobilePhone("Samsung");

        RadioPhone radioPhoneOne = new RadioPhone("Panasonic");
        RadioPhone radioPhoneTwo = new RadioPhone("Philips");

        Phone[] phones = {telePhoneOne, telePhoneTwo, mobilePhoneOne, mobilePhoneTwo, radioPhoneOne, radioPhoneTwo};

        System.out.println("Make a call");
        for (Phone model : phones) {
            makeCall(model, number[0]);
            receiveCall(model, number[2]);
        }
        System.out.println();
        System.out.println(telePhoneOne);
        System.out.println(mobilePhoneOne);
        System.out.println(radioPhoneOne);
        System.out.println();
    }
}