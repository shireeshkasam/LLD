package creational.builder;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee.Builder(1).setAge(21).setName("kkk").build();
        System.out.println(e.getName());
    }
}
