package factory_imp;

public class Computer extends Course {
    public Computer(String name, String teacher, boolean needComputer) {
        super(name, teacher, needComputer);
    }

    @Override
    public void startHomework() {
        System.out.println(String.format(formate, teacher, name, needComputer));
    }
}
