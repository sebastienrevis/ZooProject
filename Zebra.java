package be.vdab.ZooProject;

public class Zebra {
    private String zebraName;
    private double zebraWeight;
    private String zebraSex;
    private int zebraAge;

    public Zebra (String name, double weight, String sex, int age) {
        zebraName = name;
        zebraWeight = weight;
        zebraSex = sex;
        zebraAge = age;
    }

    public String getName() { return zebraName;}
    public double getWeight() {return zebraWeight;}
    public String getSex() { return zebraSex;}
    public int getAge() { return zebraAge;}

    public String toString(){
        return "The name of the zebra is " +getName()+", it weighs " + getWeight()
                +", it's a " + getSex() +", and it's "+getAge() +" years old";
    }
}

