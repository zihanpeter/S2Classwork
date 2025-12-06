import java.util.Scanner;

public class MessageApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Account 1, enter display name: ");
        String displayName1 = scanner.nextLine();
        /* todo: create a new account with the entered display name */
        Account account1 = new Account(displayName1);

        System.out.println("Account 2, enter display name: ");
        String displayName2 = scanner.nextLine();
        /* todo: create a second new account with the entered display name */
        Account account2 = new Account(displayName2);

        System.out.println("Enter your message: ");
        String msg = scanner.nextLine();

        /* todo: create a new Message object from the first account to the second with the message text just inputted */
        Message message = new Message(account1, account2, msg);

        /* todo: print the message details in the format:
        From John (UID ABCDEF0123) to Katie (UID 0123ABCDEF):
        hello
        Length: 5 characters
        <Unread>/<Read>

        you MUST call methods on the Message object you created to achieve this.

        The names John, Katie and both UIDs should be replaced by the display name and user ID of the sender and recipient as well as the length
        <Unread> or <Read> should be displayed as appropriate
         */
        System.out.println("From " + message.getSender().getDisplayName() + " (UID " + message.getSender().getUserId() +
                ") to " + message.getRecipient().getDisplayName() + " (UID " + message.getRecipient().getUserId() + "):\n" +
                message.getContents() + "\nLength: " + message.getContents().length() + " characters");
        if (message.isRead()) {
            System.out.println("<Read>");
        }
        else {
            System.out.println("<Unread>");
        }
    }
}
