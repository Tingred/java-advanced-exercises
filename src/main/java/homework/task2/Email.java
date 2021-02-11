package homework.task2;

public class Email extends Message {
    final String emailAddress;
    final String subject;

    public Email(String content) {
        super(content);
        emailAddress = "";
        subject = "";
    }

    public Email(String content, String emailAddress, String subject) {
        super(content);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }

    @Override
    public String send() {
        if (!canSend()) {
            return "Email nie może zostać wysłany";
        } else return "Email o treści \"" + getContent() + "\" został wysłany na email " + emailAddress;

    }

    @Override
    protected boolean canSend() {

        if (getContent() == null) return false;
        else if (getContent().isBlank()) return false;


        else if (emailAddress == null) return false;

        else if (!emailAddress.contains("@")) {
            return false;
        } else if (emailAddress.isBlank() || emailAddress.length() < 5) return false;

        else return true;
    }
}
