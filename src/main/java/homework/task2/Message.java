package homework.task2;

abstract public class Message {
    private final String content;

    public Message(String content) {
        this.content = content;
    }

    abstract public String send();

    protected boolean canSend() {
        if (content.length() < 5) {
            return false;

        } else if (content.isBlank()) {
            return false;

        } else return true;
    }

    public String getContent() {
        return content;
    }
}
