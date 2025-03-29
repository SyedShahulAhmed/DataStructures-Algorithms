package OOPS;
class Args{
    public String name;
    protected String email;
    private String pin;

    //Getters and Setters

    public String getPin(){
        return this.pin;
    }
    public void setPin(String p){
        this.pin = p;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Args a1 = new Args();
        a1.name = "Lucy";
        a1.email = "lucy@gmail.com";
        // a1.pin = "password";   //Error
        a1.setPin("password");
        System.out.println(a1.getPin());
    }
}
