public class dog implements Comparable<dog>
{
    private int weight;
    private int age;
    private String breed;
    private static int count;

    public dog()
    {
        weight = 0;
        age = 0;
        breed = null;
        count++;
    }
    public dog(int newWeight, String newBreed, int newAge)
    {
        weight = newWeight;
        breed = newBreed;
        age = newAge;
        count++;
    }
    public dog(int weight, String name, int age, String breed)
    {
        this.weight = weight;
        this.age = age;
        this.breed = breed;
    }

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
    }
}
