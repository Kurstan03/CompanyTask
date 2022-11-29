import java.util.Arrays;

public class Course {
    private String programing;
    private Group[] groups;
    private Instructor instructor;
    private Mentor[] mentors;

    public Course(String programing, Group[] groups, Instructor instructor, Mentor[] mentors) {
        this.programing = programing;
        this.groups = groups;
        this.instructor = instructor;
        this.mentors = mentors;
    }

    public String getPrograming() {
        return programing;
    }

    public void setPrograming(String programing) {
        this.programing = programing;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Course{" +
                "programing='" + programing + '\'' +
                ", groups=" + Arrays.toString(groups) +
                ", instructor=" + instructor +
                ", mentors=" + Arrays.toString(mentors) +
                '}';
    }
}
