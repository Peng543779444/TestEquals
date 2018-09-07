//工厂方法设计模式
public class FactoryDemo {
    public static void main(String[] args) {
        IworkFactory i = new StudentWorkFactory();
            i.getWork().doWork();
    }
}
interface IworkFactory{
    Work getWork();
}
class StudentWorkFactory implements  IworkFactory{

    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
class TeacherWorkFactory implements IworkFactory{

    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}

interface Work{
    void doWork();
}
class StudentWork implements Work{

    @Override
    public void doWork() {
        System.out.println("学生 写作业");
    }
}
class TeacherWork implements Work{

    @Override
    public void doWork() {
        System.out.println("老师批改作业");
    }
}