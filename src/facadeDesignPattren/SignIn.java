package facadeDesignPattren;

public class SignIn {
    private String user="cs@gmail.com";
    private String password="123abc";

    public boolean activeAccount(String userId,String pass){
        if(user.equals(user)){
            if(pass.equals(password)){
                System.out.println("Successfully signin");
                return true;
            }
        }
        System.out.println("Incorrect user name or password");

        return false;
    }
}
