public abstract class Person {
    private long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract double period(Group group);
    public Person[] sortAge(Person[] people){
        Person sort;
        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < people.length - 1; j++) {
                if(people[j].getAge() > people[j + 1].getAge()){
                    sort = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = sort;
                }
            }
        }
        return people;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}