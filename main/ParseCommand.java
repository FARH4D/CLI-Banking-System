package main;

import java.io.IOException;

import commands.Command;

public class ParseCommand {
    
    public static Command parse(String commandWhole) throws IOException{
        String[] commandParts = commandWhole.split(" ", 3);

        String command = commandParts[0];
        System.out.println(command);
        if (command == "hi"){
            System.out.println("Hello");
        }

        return null;



        
    }


}
