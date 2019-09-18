public class Animal {

    private int age;
    private String gender;
    private int weight;

    public Animal(){
        age = 2;
        gender = "F";
        weight = 145;
    }

    public Animal(int age, String gender,int weight){
        this.age = age;
        this.weight=weight;
        this.gender=gender;
    }


    public void sleep(){
        System.out.println("I am eating ...");

    }

    public void eat(){
        System.out.println("I am sleeping...");

    }


}
