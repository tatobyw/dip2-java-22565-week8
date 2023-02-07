class Animal{
    String name;
    String getName(){
        return name;
    }

    protected void setName(String n){
        name = n;
    }
    public void show(){
        //System.out.println("Stida cat breed");
    }
}

public class Data {
    //private String name
    public static void main(String[]args){
        Animal d1 = new Animal();
        d1.name = "Chin cat breed";
        d1.setName("Chin cat breed");
        System.out.println(d1.getName());

        d1.show();
        //System.out.println(d1.name);
    }
}