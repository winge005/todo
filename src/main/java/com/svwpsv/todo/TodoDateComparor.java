/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.svwpsv.todo;

import java.util.Comparator;

/**
 *
 * @author Eigenaar
 */
public class TodoDateComparor implements Comparator<Todo> {

    @Override
    public int compare(Todo todo1, Todo todo2) {
        return todo1.getDate().compareTo(todo2.getDate());
    }
}
