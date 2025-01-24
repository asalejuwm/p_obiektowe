public interface Authentication {
    boolean login(String username, String password);
    boolean resetPassword(String username, String oldPassword, String newPassword);
}
