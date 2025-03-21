package POOP5;

public class Puerta {
    final private String pass = "password";
    private boolean isOpen;

    public boolean getStateDoor(){
        return isOpen;
    }

    public void changeStateDoor(String s){
        if(s.equals(pass)){ isOpen = !isOpen; }
        else{
            System.out.println("Intruso detectado");
        }
    }
}
