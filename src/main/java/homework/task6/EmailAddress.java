package homework.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddress {

    private final String emailAddress;

    private EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public static EmailAddress of(String emailAddress){
        Pattern pattern = Pattern.compile("[A-Za-z0-9]+[@][A-Za-z0-9]+[.][A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(emailAddress);
        if (matcher.matches()){
           return new EmailAddress(emailAddress);
        }
        else return null;

    }

    public String get() {
        return emailAddress;
    }
    public String username(){
        String[] split = emailAddress.split("@");
        return split[0];
    }
    public String host(){
        String[] split = emailAddress.split("@");
        return split[1];
    }
    public String topDomain(){
        String[] split = emailAddress.split("[.]");
        return split[split.length-1];
    }

}
