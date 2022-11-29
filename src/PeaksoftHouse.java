import java.util.Arrays;

public class PeaksoftHouse extends Company{
    public PeaksoftHouse(String name, String address, Course[] courses, String languageOfInstruction) {
        super(name, address, courses, languageOfInstruction);
    }

    @Override
    public String toString() {
        return "PeaksoftHouse{" +
                "name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", courses=" + Arrays.toString(getCourses()) +
                ", languageOfInstruction='" + getLanguageOfInstruction() + '\'' +
                '}';
    }
}
