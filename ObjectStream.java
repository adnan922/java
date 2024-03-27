import java.io.*;

class MyClass implements Serializable {
    String name;
    int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectStream{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialize object to file
        FileOutputStream fops = new FileOutputStream("data.ser");
        ObjectOutputStream outputStream = new ObjectOutputStream(fops);
        MyClass obj = new MyClass("John", 30);
        outputStream.writeObject(obj);
        outputStream.close();

        // Deserialize object from file
        FileInputStream fips = new FileInputStream("data.ser")
        ObjectInputStream inputStream = new ObjectInputStream(fips);
        MyClass newObj = (MyClass) inputStream.readObject();
        inputStream.close();

        System.out.println("Deserialized Object: " + newObj.name + ", " + newObj.age);
    }
}
