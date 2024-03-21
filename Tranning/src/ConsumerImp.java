import java.util.function.Consumer;

public class ConsumerImp implements Consumer<Student> {

    @Override
    public void accept(Student student) {
        System.out.println(student);
    }
}
