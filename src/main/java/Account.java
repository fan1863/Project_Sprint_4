public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        String[] userData = name.split(" ");
        if (name.isEmpty()) {
            return false;
        } else if (name.length() < 3) {
            return false;
        } else if (name.length() > 19) {
            return false;
        } else if (name.length() != name.trim().length()) {
            return false;
        } else if (userData.length != 2) {
            return false;
        } else {
            return true;
        }
    }
}

