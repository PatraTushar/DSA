package SERIALIZATION;

import java.io.*;

class Account implements Serializable {

    String username = "tushar";
    transient String password = "coder";
}

class DefaultSerializationDemoUsingTransient {

    public static void main(String[] args) throws Exception {

        Account a1 = new Account();
        System.out.println(a1.username + ":" + a1.password);

        // serialization
        FileOutputStream fop = new FileOutputStream("xyz.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fop);
        oos.writeObject(a1);

        // Deserialization
        FileInputStream fis = new FileInputStream("xyz.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account) ois.readObject();

        System.out.println(a2.username + ":" + a2.password);


    }
}
