package com.Rover;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maximum coordinates of the plateau: ");
        Plateau plateau = new Plateau(in.nextInt(), in.nextInt());
        MarsRover rover = new MarsRover(in.nextInt(), in.nextInt(), in.next(), plateau);
        String commands = in.next();
        rover.runCommands(commands);
        System.out.println(rover.toString());
        in.close();
    }
}
