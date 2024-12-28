public class UserAuthentication implements Authentication {
    private String username;
    private String password;
    private boolean loggedIn;
    public UserAuthentication(){
        this.username="";
        this.password="";
        this.loggedIn=false;
    }
    public UserAuthentication(String username, String password){
        this.username = username;
        this.password = password;
        this.loggedIn = false;
    }
    public boolean getLoggedIn(){
        return this.loggedIn;
    }
    public boolean login(String username, String password){
        if(!username.equals(this.username) || !password.equals(this.password)){
            throw new IllegalArgumentException("Niepoprawny login lub haslo");
        }
        System.out.println("Zalogowano");
        this.loggedIn = true;
        return true;
    }
    public void logout(){
        System.out.println("Wylogowano");
        this.loggedIn = false;
    }
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        if(!username.equals(this.username) || !oldPassword.equals(this.password)){
            throw new IllegalArgumentException("Niepoprawny login lub haslo");
        }
        System.out.println("Haslo zmienione pomyslnie");
        this.password = newPassword;
        return true;
    }

}
