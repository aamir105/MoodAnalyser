package org.example;

public class MoodAnalyzer {
    public String analyseMood(String message){
        message = message.toLowerCase();
        if (message.contains("sad")){
            return "SAD";
        } else if (message.contains("happy")) {
            return "HAPPY";
        }else{
            return " ";
        }
    }

    public static void main(String[] args) {
//        System.out.println("Welcome to mood analyser test.");


    }
}
