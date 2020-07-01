package be.vdab.ZooProject;

public class Giraffe {
    private String giraffeName;
    private double giraffeWeight;
    private String giraffeSex;
    private int giraffeAge;

    public Giraffe (String name, double weight, String sex, int age) {
        giraffeName = name;
        giraffeWeight = weight;
        giraffeSex = sex;
        giraffeAge = age;
    }

    public String getName() { return giraffeName;}
    public double getWeight() {return giraffeWeight;}
    public String getSex() { return giraffeSex;}
    public int getAge() { return giraffeAge;}

    public String toString(){
        return "The name of the giraffe is " +getName()+", it weighs " + getWeight()
                +", it's a " + getSex() +", and it's "+getAge() +" years old";
    }
}

