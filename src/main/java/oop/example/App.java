package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Micah Puccio-Ball
 */
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int width;
        int length;
        int area;
        int feetPerGallon = 350;
        int numGallons;

        System.out.printf("Length: ");
        length = Integer.parseInt(input.nextLine());
        System.out.printf("Width: ");
        width = Integer.parseInt(input.nextLine());

        area = width*length;

        numGallons = area / feetPerGallon;
        if(numGallons % area != 0)   {
            numGallons = numGallons + 1;
        }

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.\n", numGallons, area);


    }
}
