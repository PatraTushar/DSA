package SERIALIZATION;

import java.io.*;

class Accounts implements Serializable {

    String username = "Tushar";
    transient String password = "codeEveryday";

    private void writeObject(ObjectOutputStream oos) throws Exception {
        oos.defaultWriteObject();
        String ePwd = "123" + password;
        oos.writeObject(ePwd);
    }

    private void readObject(ObjectInputStream ois) throws Exception {

        ois.defaultReadObject();
        String ePwd = (String) ois.readObject();
        password = ePwd.substring(3);
    }
}


class customizedSerializationDemo {

    public static void main(String[] args) throws Exception {

        Accounts a1 = new Accounts();
        System.out.println(a1.username + ":" + a1.password);

        // serialization
        FileOutputStream fos = new FileOutputStream("pqr.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        // Deserialization
        FileInputStream fis = new FileInputStream("pqr.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Accounts a2 = (Accounts) ois.readObject();

        System.out.println(a2.username + ":" + a2.password);


    }
}
