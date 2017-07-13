package it.madlabs;

/**
 * Created by gabriele on 13/07/17.
 */
public class For {

    public static class Dog {
        private int age;
        private String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {

        int[] ints = {1, 2, 3};
        String[] strings = {"one", "two", "tree"};
        Dog[] dogs = {new Dog(1, "Bobby"), new Dog(5, "Pluto"), new Dog(13, "Audrey")};

        for (int anInt : ints) {
            System.out.println("anInt = [" + anInt + "]");
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.println("ints["+i+"] = [" + ints[i] + "]");
        }

        //Fai lo stesso con gli altri array, stampando tutte le strings e tutti i cani, in questo modo: "Dog Pluto is 5 years old"

    }
}
