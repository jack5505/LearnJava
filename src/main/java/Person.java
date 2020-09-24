public class Person  implements Comparable<Person>{

    // field all should be final
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
       // if (this == obj) return true;
       /* if (obj == null ||  obj.getClass() != this.getClass()) {
            return  false;
        }
        */
        if (!(obj instanceof Person)) {
            return true;

        }
        Person person = (Person) obj;
        return name.equalsIgnoreCase(person.name) && age == person.age;
    }

    @Override
    public int hashCode(){
         return name.hashCode() * 31 + age;
        // return 10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}
