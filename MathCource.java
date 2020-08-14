package factory_imp;

public class MathCource extends Course {
    public MathCource(String name, String teacher, boolean needComputer) {
        super(name, teacher, needComputer);
    }

    @Override
    public void startHomework() {
        System.out.println("I need Computer and need more time");
        System.out.println(String.format(formate, name, teacher, needComputer));
    }
}
