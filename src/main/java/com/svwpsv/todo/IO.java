/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.svwpsv.todo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Eigenaar
 */
public class IO {
   
    public static void serializeTodos(final List<Todo> todos) {
        try
        {   
            FileOutputStream file = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Todos.ser"));
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(todos);
            out.close();
            file.close();
        } catch(IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    public static void serializeHours(final List<HourScheme> hours) {
        try
        {   
            FileOutputStream file = new FileOutputStream(new File(System.getProperty("user.dir") + "\\Hours.ser"));
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(hours);
            out.close();
            file.close();
        } catch(IOException ioe) {
            System.out.println(ioe);
        }
    }
    
    public static List<Todo> deSerialzeTodos() {
        List<Todo> todos = null;
        try
        {   
             FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "\\Todos.ser"));
             ObjectInputStream in = new ObjectInputStream(file);
             todos = (List<Todo>) in.readObject();
            in.close();
            file.close();
        } catch(ClassNotFoundException | IOException ioe) {
            System.out.println(ioe);
        }
        
        return todos;
    }
    
    public static List<HourScheme> deSerialzeHours() {
        List<HourScheme> hourSchemes = null;
        try
        {   
             FileInputStream file = new FileInputStream(new File(System.getProperty("user.dir") + "\\Hours.ser"));
             ObjectInputStream in = new ObjectInputStream(file);
             hourSchemes = (List<HourScheme>) in.readObject();
            in.close();
            file.close();
        } catch(ClassNotFoundException | IOException ioe) {
            System.out.println(ioe);
        }
        
        return hourSchemes;
    }
    
    public static void serializeNote(final String text) throws IOException {
           Files.write(Paths.get(new File(System.getProperty("user.dir")) + "\\note.txt"), text.getBytes());
    }
    
    public static String deSerializeNote() throws IOException {
        return Files.readString(Paths.get(System.getProperty("user.dir") + "\\note.txt"));
    }
}
