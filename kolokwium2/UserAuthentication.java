public class UserAuthentication implements Authentication{
    String username;
    String password;
    final int isAdmin = 0;
    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public boolean login(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Logged in successfully");
            return true;
        }
        System.out.println("Username or password incorrect");
        return false;
    }
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        if(this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Reset password successfully");
            return true;
        }
        System.out.println("Username or old password incorrect");
        return false;
    }
    public static void main(String[] args) {
        UserAuthentication ua = new UserAuthentication("admin", "admin");
        System.out.println(ua.login("admin", "admin"));
        ua.resetPassword("admin","admin","newPassword");
        System.out.println(ua.login("admin", "admin"));
        System.out.println(ua.login("admin","newPassword"));
    }
}
