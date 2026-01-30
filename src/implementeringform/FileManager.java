/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementeringform;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author taglu01
 */
public class FileManager {

    public void saveToFile(ArrayList<Form> kon) {
        try {
            FileOutputStream  fileOut = new FileOutputStream ("savedKontaktLista.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(kon);
            out.flush();
            out.close();
            fileOut.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }
    }

    public ArrayList<Form> readFromFile() {
        ArrayList<Form> lista = null;
        try {
            FileInputStream fileIn = new FileInputStream("savedKontaktLista.ser");
            ObjectInputStream oin = new ObjectInputStream(fileIn);
            lista = (ArrayList<Form>) oin.readObject();
            oin.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
        return lista;

    }

}
