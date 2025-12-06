public class Message {
    private Account sender;
    private Account recipient;
    private String contents;
    private boolean read;

    public Message(Account sender, Account recipient, String contents) {
        this.sender = sender;
        this.recipient = recipient;
        this.contents = contents;
        read = false;
    }

    public Account getSender() {
        return sender;
    }

    public Account getRecipient() {
        return recipient;
    }

    public String getContents() {
        return contents;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
