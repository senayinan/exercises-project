package com.senayinan.exercises_project;

public class TrafficLights {
    public void displayColor(String lightColor) {
        switch (lightColor) {
            case "RED":
                System.out.println("Stop");
                break;
            case "GREEN":
                System.out.println("Go");
                break;
            case "YELLOW":
                System.out.println("Caution");
                break;
            default:
                System.out.println("Invalid state");
        }
    }
}
