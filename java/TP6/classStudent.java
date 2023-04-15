public class classStudent {
    private int id;
    private String name;
    private int year;

    public classStudent(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "  id=" + id + "\n\t\tname=" + name + "\n\t\tyear=" + year + "";
    }

    public void setName(String name2) {
    }
}
