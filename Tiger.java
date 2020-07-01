package be.vdab.ZooProject;

public class Tiger {
    private String tigerName;
    private double tigerWeight;
    private String tigerSex;
    private int tigerAge;

    public Tiger(String name, double weight, String sex, int age) {
        tigerName = name;
        tigerWeight = weight;
        tigerSex = sex;
        tigerAge = age;
    }

    public String getName() { return tigerName;}
    public double getWeight() {return tigerWeight;}
    public String getSex() { return tigerSex;}
    public int getAge() { return tigerAge;}

    public String toString(){
        return "The name of the tiger is " +getName()+", it weighs " + getWeight()
                +", it's a " + getSex() +", and it's "+getAge() +" years old";
    }
}

