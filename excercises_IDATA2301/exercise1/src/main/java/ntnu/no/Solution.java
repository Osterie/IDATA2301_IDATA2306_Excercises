package ntnu.no;

public class Solution {

    public boolean isValidUsername(String username){
        
        // length is 8-30 characters inclusive
        if (username.length() < 8 || username.length() > 30) {
            return false;
        }

        // starts with a letter
        if (!username.matches("^[a-zA-Z]")) {
            return false;
        }

        // contains only letters, numbers, and underscores
        if (!username.matches("^[a-zA-Z0-9_]*$")) {
            return false;
        }

        return true;
    }
}
