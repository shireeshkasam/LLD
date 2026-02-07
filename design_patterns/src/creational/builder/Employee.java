package creational.builder;

public class Employee {
    private final int id;
    private final String name;
    private final int age;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.age = builder.age;
        this.name = builder.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private final int id;
        private String name;
        private int age;

        public Builder(int id){
            this.id = id;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            if(this.name == null)
                throw new IllegalArgumentException();
            return new Employee(this);
        }
    }
}
