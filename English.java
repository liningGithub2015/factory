package factory_imp;

public class English extends Course {
    public English(String name, String teacher, boolean needComputer) {
        super(name, teacher, needComputer);
    }

    @Override
    public void startHomework() {
        System.out.println(String.format(formate, teacher, name, needComputer));
        System.out.println("I am differ you");
    }
}
