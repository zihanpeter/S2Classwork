public class Account {
    private String userId;
    private String displayName;

    public Account(String displayName) {
        this.displayName = displayName;
        userId = randomiseUID();
    }

    private String randomiseUID() {
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String id = "";
        for (int i = 0; i < 10; i++) {
            int index = (int) (Math.random() * charSet.length());
            id += charSet.substring(index, index+1);
        }
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
