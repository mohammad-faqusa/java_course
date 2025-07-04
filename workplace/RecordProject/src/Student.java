public class Student {
    private String id;
    private String name;
    private String dataOfBirth;
    private String classList;

    public Student(String id, String name, String dataOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.classList = classList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
