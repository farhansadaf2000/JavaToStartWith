package classwork;

public class Computer {
    public Computer(){
        System.out.println("I'm inside default constructor.");
    }
    public static void main(String[] args) {
        System.out.println("I am in Main Method now.");
        Computer myComputer = new Computer();
        myComputer.browse();
        myComputer.playVideos();
        myComputer.receiveMail();
    }
    public void browse() {
        System.out.println("This method will allow me to browse the web.");
    }
    public void playVideos() {
        System.out.println("This method will allow me to play some videos.");
    }
    public void receiveMail() {
        System.out.println("This method will allow me to receive mail.");
    }
}
