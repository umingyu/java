class PersonalComputer {

    public void turnOn(String s) {
        System.out.println("Turning on the "+s);
    }
    public void printInfo(String s, String s2){
        System.out.println(s+":"+" "+s2);
    }
}

class Monitor {
    PersonalComputer PC = new PersonalComputer();
    public void Monitor() {
        PC.turnOn("Monitor");
    }
    void info() {
        System.out.println("The spec of the monitor");
        PC.printInfo("Size", Size);
        PC.printInfo("Color", Color);
        PC.printInfo("Power", Power);
    }

    private String Size = "24 inch";
    private String Color = "Black";
    private String Power = "45W";

}

class Computer {
    PersonalComputer PC = new PersonalComputer();
    public void Computer() {
        PC.turnOn("computer");
    }
    void info(){
        System.out.println("The spec of the computer");
        PC.printInfo("CPU",CPU);
        PC.printInfo("Memory", Memory);
        PC.printInfo("HDD", HDD);
        PC.printInfo("Color", Color);
        PC.printInfo("Power", Power);
    }
    private String CPU = "CORE i7";
    private String Memory = "16GB";
    private String HDD = "2TB";
    private String Color = "White";
    private String Power = "500W";
}

public class Homework5 {
    public static void main()
    {
        Computer C = new Computer();
        Monitor M = new Monitor();

            C.Computer();
            M.Monitor();
            C.info();



            M.info();

    }
}
