public class Student extends Person{
    private double contract;

    public Student(long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public double period(Group group) {
        int year = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).getYear();
        int month = group.getDateOfFinish().minusMonths(group.getDateOfStart().getMonthValue()).getMonthValue();
        if (year > 1){
            year -= 1;
            return ((year * 12) + month) * getContract();
        }else {
            return month * getContract();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender()+
                ", contract=" + getContract() +
                '}';
    }
}
