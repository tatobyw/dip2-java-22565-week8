public class Main {
    public String name = "Mr.Mark Zuckerberg";
    public Number salary;
    public String ceo;

    Main(){
        name = "Lung Sri";
        System.out.println(name);
    }

    Main(String c){
        ceo = c;
    }

    Main(String n, Number $){
        name = n;
        salary = $;
        System.out.println("Constructor Called: " + n + "Salary: " + salary);
    }

    void getName(){
        System.out.println("Name of CEO: " + this.name);
    }

    public static void main(String[] args) {
        Main obj = new Main("Jeff Bezzo ", 10000);
        Main obj2 = new Main();
        Main obj3 = new Main("Lung chai");

        obj2.getName();
        System.out.println("The name is ceo " + obj3.ceo);
        System.out.println("The name is " + obj.name + "\n" + "Salary: "+ obj.salary);
    }
}