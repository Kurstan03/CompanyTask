import java.util.Arrays;

public class ItAcademy extends Company{
    public ItAcademy(String name, String address, Course[] courses, String languageOfInstruction) {
        super(name, address, courses, languageOfInstruction);
    }

    @Override
    public String toString() {
        return "ItAcademy{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", courses=" + Arrays.toString(getCourses()) +
                ", languageOfInstruction='" + getLanguageOfInstruction() + '\'' +
                '}';
    }
}
