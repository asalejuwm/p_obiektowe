public class AuthenticationTest {
    public static void main(String[] args) {
        // Test dla UserAuthentication
        Authentication userAuth = new UserAuthentication();
        System.out.println("\nTesting UserAuthentication:");
        userAuth.login("user", "user123");
        userAuth.resetPassword("user", "user123", "newUser123");
        userAuth.logout();

        // Test dla AdminAuthentication
        Authentication adminAuth = new AdminAuthentication();
        System.out.println("\nTesting AdminAuthentication:");
        adminAuth.login("admin", "admin123");
        adminAuth.resetPassword("admin", "admin123", "newAdmin123");
        adminAuth.logout();
    }
}