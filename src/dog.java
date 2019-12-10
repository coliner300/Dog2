import javax.naming.Name;

public class dog implements Comparable<dog>
{
    //1) instance variables
    private int weight;
    private int age;
    private String breed;
    private static int count = 0; //number of dogs


    //2) constructors
    public dog()
    {
        weight = 0;
        age = 0;
        breed = null;
        count++;
    }//end zero arg/default constructor
    public dog(int newWeight, String newBreed, int newAge)
    {
        weight = newWeight;
        breed = newBreed;
        age = newAge;
        count++;
    }//end of three arg constructor
    public dog(int weight, String name, int age, String breed)
    {
        this.weight = weight;
        this.age = age;
        this.breed = breed;
    }//end multi arg constructor

    public int getWeight()
    {
        return weight;
    }
    public String getBreed()
    {
        return breed;
    }
    public int getAge()
    {
        return age;
    }

    @Override
    public int compareTo(dog someDog) {

        if(this.age < someDog.age)
        {
            return -1;
        }
        else if(this.age == someDog.age)
        {
            return 0;
        }
        else
        {
        return 1;
        }
    }//end of compareTo implement from interface

    public String toString()
    {
        String output = "";
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;
        output += "\nAge: " +  age;

        return output;
    }//end toString

}
