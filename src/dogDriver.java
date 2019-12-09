public class dogDriver {

    public static void main(String[] args) {
        dog Fang = new dog(80, "Husky", 5);
        dog Nutmeg = new dog(45, "Australian Sheepdog", 12);
        dog Kumar = new dog(127, "Human Dog", 16);

        System.out.println("Fang's breed: " + Fang.getBreed());
        System.out.println("Fang's age: " + Fang.getAge());
        System.out.println();
        System.out.println("Nutmeg's weight: " + Nutmeg.getWeight());
        System.out.println();
        System.out.println("Vivek's breed: " + Kumar.getBreed());
        System.out.println("Vivek's wight: " + Kumar.getWeight());
        System.out.println("Vivek's age: " + Kumar.getAge());
        System.out.println();


        System.out.println("Fang compared to Nutmeg: " + Nutmeg.compareTo(Fang));
        System.out.println("Fang compared to Kumar: " + Fang.compareTo(Kumar));

    }
}
