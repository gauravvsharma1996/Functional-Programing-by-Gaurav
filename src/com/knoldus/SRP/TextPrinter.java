package com.knoldus.SRP;

import java.util.Arrays;

public class TextPrinter {
    Text_Manipulator textManipulator;

    public TextPrinter(Text_Manipulator textManipulator ){
        this.textManipulator = textManipulator;
    }

    public String printText(){
       return textManipulator.getText();
    }

    public String printOutEachWordOfText(){
        return Arrays.toString(textManipulator.getText().split("\\s"));
    }

    public String printRangeOfCharacters(int startingIndex, int endIndex){
        return textManipulator.getText().substring(startingIndex,endIndex);
    }
}
