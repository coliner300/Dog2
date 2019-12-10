public class dogDriver {

    public static void main(String[] args) {
        //1. Create a dog or more
        dog Fang = new dog(80, "Husky", 5);
        dog Nutmeg = new dog(45, "Australian Sheepdog", 12);
        dog Kumar = new dog(127, "Human Dog", 16);

        //the println's for all of the data

        //fang's information
        System.out.println("Fang's breed: " + Fang.getBreed());
        System.out.println("Fang's age: " + Fang.getAge());
        System.out.println();
        //nutmeg's information
        System.out.println("Nutmeg's weight: " + Nutmeg.getWeight());
        System.out.println();
        //Kumar's information
        System.out.println("Kumar's stuff " + Kumar.toString());
//        System.out.println("Vivek's breed: " + Kumar.getBreed());
//        System.out.println("Vivek's wight: " + Kumar.getWeight());
//        System.out.println("Vivek's age: " + Kumar.getAge());
        System.out.println();


        //compareTo methods

        //compare fang to nutmeg
        System.out.println("Fang compared to Nutmeg: " + Nutmeg.compareTo(Fang));
        //compare fang to kumar
        System.out.println("Fang compared to Kumar: " + Fang.compareTo(Kumar));



    }
}
