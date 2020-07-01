package be.vdab.ZooProject;

public class Elephant {
    private String elephantName;
    private double elephantWeight;
    private String elephantSex;
    private int elephantAge;

    public Elephant (String name, double weight, String sex, int age) {
        elephantName = name;
        elephantWeight = weight;
        elephantSex = sex;
        elephantAge = age;
    }

    public String getName() { return elephantName;}
    public double getWeight() {return elephantWeight;}
    public String getSex() { return elephantSex;}
    public int getAge() { return elephantAge;}

    public String toString(){
        return "The name of the elephant is " +getName()+", it weighs " + getWeight()
                +", it's a " + getSex() +", and it's "+getAge() +" years old";
    }
}

