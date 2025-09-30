package ejercicio1;

public class Main {
    public static void main(String[] args) {
          NoGenericMethods user1 = new NoGenericMethods("Joe", "Pedro", "Antonio");
          System.out.println(user1);
          user1.setName1("Gabor");
          user1.setName2("Leo");
          user1.setName3("Marco");
          System.out.println("\n Name1: " + user1.getName1() + "\n Name2: " + user1.getName2() + "\n Name3: " + user1.getName3());
    }
}