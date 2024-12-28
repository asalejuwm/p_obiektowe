public interface Authentication {
    abstract boolean login(String username, String password);
    abstract void logout();
    abstract boolean resetPassword(String username, String oldPassword, String newPassword);

}
