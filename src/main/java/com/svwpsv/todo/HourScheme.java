/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.svwpsv.todo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Eigenaar
 */
public class HourScheme implements Serializable {
    private LocalDate date;
    private int normalHours;
    private int lowHours;
    private int highHours;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate localdate) {
        this.date = localdate;
    }

    public int getNormalHours() {
        return normalHours;
    }

    public void setNormalHours(int normalHours) {
        this.normalHours = normalHours;
    }

    public int getLowHours() {
        return lowHours;
    }

    public void setLowHours(int lowHours) {
        this.lowHours = lowHours;
    }

    public int getHighHours() {
        return highHours;
    }

    public void setHighHours(int highHours) {
        this.highHours = highHours;
    }
    
    
    
}
