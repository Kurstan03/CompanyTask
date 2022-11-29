import java.time.LocalDate;

public class Instructor extends Person{
    private double salary;

    public Instructor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {

        int year = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).getYear();
        int month = group.getDateOfFinish().minusMonths(group.getDateOfStart().getMonthValue()).getMonthValue();

        if (year > 1){
            year -= 1;
            return ((year * 12) + month) * getSalary();
        }else {
            return month * getSalary();
        }
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", salary=" + getSalary() +
                '}';
    }
}
