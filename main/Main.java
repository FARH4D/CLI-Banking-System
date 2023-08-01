package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import commands.Command;

public class Main{

    public static void main(String[] args) throws IOException {
        


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Banking System");
        System.out.println("Enter a command, type in help to see list of commands");

        while(true){
            String userCommand = br.readLine();
            if (userCommand.equals("exit")){
                break;
            }

            try{
                Command command = CommandParser.parse(userCommand);
                
            } catch (IOException ex){
                System.out.println();
            }
        }
    }
}