package io;

import java.io.*;


public class ReadWriteObject {
    public static void main(String[] args) throws Exception {
        ReadWriteObject rwo = new ReadWriteObject();
        rwo.writeObject();
        rwo.readObject();
    }

    public void writeObject() throws Exception{
        String names[] = {};
        System.out.println(names[4]);

        Person person1 = new Person("Peter",33,"77777");
        System.out.println(person1);

        System.out.println(Math.abs(-77));

        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("person2.dat"));
        output.writeObject(person1);
        output.close();
        System.out.println("Object written successfully...");
    }

    public void readObject() throws Exception{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("person2.dat"));
        Person obj = (Person)input.readObject();
        System.out.println(obj);
        input.close();


        System.out.println("Object read successfully...");
    }
}
