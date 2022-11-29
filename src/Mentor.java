public class Mentor extends Instructor{
    public Mentor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }

    @Override
    public double period(Group group) {
        return super.period(group);
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", salary=" + getSalary() +
                '}';
    }
}
