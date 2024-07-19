import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutPutStreamEx {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Employee.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Employee employee = new Employee("Anuka",21,"male","Panadura");

        objectOutputStream.writeObject(employee);

        objectOutputStream.close();

    }
}
