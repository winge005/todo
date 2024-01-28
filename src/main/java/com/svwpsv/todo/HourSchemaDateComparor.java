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
public class HourSchemaDateComparor implements Comparator<HourScheme> {

    @Override
    public int compare(HourScheme hourScheme1, HourScheme hourScheme2) {
        return hourScheme1.getDate().compareTo(hourScheme2.getDate());
    }
}
