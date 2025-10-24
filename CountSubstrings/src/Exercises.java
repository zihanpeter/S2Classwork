public class Exercises {
    /* return true if key appears in message more than 3 times
  this method should ignore lower case/upper case and count
  all instances of key regardless of case
  */
    public static boolean countKeyInstances(String key, String message) {
        int keyLen = key.length();
        int count = 0;
        for (int i = 0; i <= message.length() - keyLen; i++) {
            if (message.substring(i, i + keyLen).equals(key)) {
                count++;
            }
        }
        return count >= 3;
    }

    public static void main(String[] args) {
        // todo - test data
        System.out.println(countKeyInstances("o", "prorioiioo"));
        System.out.println(countKeyInstances("cr", "encrcycc"));
    }

}
