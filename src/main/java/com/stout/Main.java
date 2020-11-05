/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stout;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author Thomas Stout
 */
public class Main{

    /**
     * @param args the command line arguments
     * @return random string
     */
    public static String randomStringValue(){
        int randomInt = ThreadLocalRandom.current().nextInt(65, 90 + 1);
        String randomString = Integer.toString(randomInt);
        return randomString.toUpperCase();
    }
    
    public static void main(String[] args) {
        ArrayList<Widget> widgets = new ArrayList<>();
        
        Supplier<Widget> randomWidget = () -> {
            //found on StackOverflow: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java/41273686
            //author -> answered: Greg Case, edited: MultiplyByZer0
            int randomNum = ThreadLocalRandom.current().nextInt(-10, 90 + 1); 
            String randomString = randomStringValue();
            Widget widget = new Widget(randomNum, randomString);
            return widget;
            
        };

        Predicate<Widget> isZeroOrGreater = Widget -> Widget.getValue() >= 0;
        
        UnaryOperator<Widget> allLowercase = Widget -> { //couldn't figure out how to write on one line
            Widget.setName(Widget.getName().toLowerCase());
            return Widget;
        };
        
        Consumer<Widget> newLine = (Widget) -> System.out.println(Widget.toString());
            
        for(int i = 0; i < 20; i++){
            Widget newWidget = randomWidget.get(); // STEP 7: Use the Supplier .get() method to instantitate a Widget object
            if(isZeroOrGreater.test(newWidget)){
            allLowercase.apply(newWidget);
            widgets.add(newWidget);
            }
        }
        /*widgets.forEach(newLine.accept(Widget));
            Wasn't sure what argument to throw in here
        */
        
    }
       
    
    
}
