import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student(1, "Erkinbaev Kurstan", 19, 'm', 1200.23),
                new Student(2, "Shakirov Altynbek", 16, 'm', 11000.532),
                new Student(3, "Alymbekov Yryskeldi", 16, 'm', 15000.3289),
                new Student(4, "Zhumabek uulu Syimyk", 21, 'm', 10000.278),
                new Student(5, "Taalaibekov Baitik ", 20, 'm', 21000.5),
                new Student(6, "Halikova Madina", 17, 'f', 13500),
                new Student(7, "Orozaliev Baiysh", 22, 'm', 9800)
        };
        Instructor instructor = new Instructor(8, "Asangazieva Aijamal", 23, 'f', 56000.2435);

        Mentor[] mentors = {
                new Mentor(9, "Toichubai uulu Muhammed", 25, 'm', 55000.2341),
                new Mentor(10, "Bazarbai uulu Rahim", 22, 'm', 55000.1624)
        };
        Person[] people = new Person[]{students[0], students[1], students[2], students[3], students[4], students[5], students[6], instructor, mentors[0], mentors[1]};
        Group[] groups = {
                new Group("java 8", students, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 1)),
                new Group("javascript 8", students, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 1)),
        };

        Course[] courses = {
                new Course("java", groups, instructor, mentors),
                new Course("Javascript", groups, instructor, mentors)
        };
        Company[] companies = {
                new PeaksoftHouse("Peaksoft", "Osh", courses, "kyrgyz"),
                new ItAcademy("IT Academy", "Bishkek", courses, "english")
        };

                                                           // methods

        System.out.println("Baardyk studentterdin kontragy: " + Company.income(students));
        System.out.println("\n===========================================\n");
        System.out.println(instructor.getFullName() + "  general salary: " + instructor.period(groups[0]));
        System.out.println("\n===========================================\n");
        System.out.println(mentors[0].getFullName() + "  general salary: " + mentors[0].period(groups[0]));
        System.out.println("\n===========================================\n");
        System.out.println(mentors[1].getFullName() + "  general salary: " + mentors[1].period(groups[0]));
        System.out.println("\n===========================================\n");

        System.out.println("sort ages: ");
        for (Person p : people[0].sortAge(people)) {
            System.out.println(p.getFullName() + ". age: " + p.getAge());
        }
    }
}