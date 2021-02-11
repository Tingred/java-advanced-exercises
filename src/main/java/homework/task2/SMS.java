package homework.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SMS extends Message {

    final String phoneNumber;

    public SMS(String content) {
        super(content);
        phoneNumber = "";
    }

    public SMS(String content, String phoneNumber) {
        super(content);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {
        if (!canSend()) {
            return "SMS nie może zostać wysłany";
        }
        else return "SMS o treści \"" + getContent() + "\" został wysłany na numer " + phoneNumber;

    }

    @Override
    protected boolean canSend() {

        if (phoneNumber.isBlank() || phoneNumber.length()!=9) return false;

        // W zasadzie wystarczyło by tylko to sprawdzenie poniżej.
        Pattern pattern = Pattern.compile("[0-9]{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.matches();
        if (result) return true;
        else return false;

    }
}
