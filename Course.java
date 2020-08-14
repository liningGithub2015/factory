package factory_imp;

public abstract class Course {
    protected String name;
    protected String teacher;
    protected boolean needComputer;
    protected String formate = "%s told us to do %s homework. Computer is required %b.";

    public Course(String name, String teacher, boolean needComputer) {
        this.name = name;
        this.teacher = teacher;
        this.needComputer = needComputer;
    }

    public abstract void startHomework();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public boolean isNeedComputer() {
        return needComputer;
    }

    public void setNeedComputer(boolean needComputer) {
        this.needComputer = needComputer;
    }
}
