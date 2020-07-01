package be.vdab.ZooProject;

public class Crocodile {
    private String crocodileName;
    private double crocodileWeight;
    private String crocodileSex;
    private int crocodileAge;

    public Crocodile(String name, double weight, String sex, int age) {
        crocodileName = name;
        crocodileWeight = weight;
        crocodileSex = sex;
        crocodileAge = age;
    }

    public String getName() { return crocodileName;}
    public double getWeight() {return crocodileWeight;}
    public String getSex() { return crocodileSex;}
    public int getAge() { return crocodileAge;}

    public String toString(){
        return "The name of the crocodile is " +getName()+", it weighs " + getWeight()
                +", it's a " + getSex() +", and it's "+getAge() +" years old";
    }
}

