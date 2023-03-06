package Lesson_21022023_HW;

public class TelePhone extends Phone {

    public TelePhone(String model) {
        super.model = model;
    }

    @Override
    public void call(String number) {
        System.out.println("Phone " + model + " call to " + number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("Phone " + model + " receive call from " + number);
    }

    @Override
    public String toString() {
        return "TelePhone{" +
                "model='" + model + '\'' +
                '}';
    }
}