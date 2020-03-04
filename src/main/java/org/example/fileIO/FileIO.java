package org.example.fileIO;

import org.example.model.CalendarUser;

import java.io.*;

public class FileIO implements Serializable {

    public void savePerson(CalendarUser user) throws IOException {
        String filename = "../fileIO/saveUser.txt";
        FileOutputStream file = new FileOutputStream(filename);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        file.close();
    }


    public void readFile() throws IOException {

        String filename = "../fileIO/saveUser.txt";
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);

        in.close();
        file.close();
    }


}
