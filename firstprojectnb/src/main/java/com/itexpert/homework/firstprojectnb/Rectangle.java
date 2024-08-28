/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexpert.homework.firstprojectnb;

/**
 *
 * @author Ana
 */
public class Rectangle {
   private double length;
    private double width;
    
    // Constructor with corrected parameter name
    public Rectangle(double length, double width) {
        this.length = length;  // Corrected typo: changed 'lenght' to 'length'
        this.width = width;
    }
    
    // Calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }
    
    // Calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    // Getters for length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
