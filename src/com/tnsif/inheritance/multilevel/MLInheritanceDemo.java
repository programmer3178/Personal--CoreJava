package com.tnsif.inheritance.multilevel;

/**
 * @author sys
*/
public class MLInheritanceDemo {

        /*
        * excecutor mehods
        */
       
    public static void main(String[] args) {
                Word word=new Word();
		System.out.println("Is text in Wordpad bold? " + word.isBold());
		
		word.formatText(true);
		
		word.displayContent();
        word.enableSpellCheck(true);
        
        System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		System.out.println(word.content);
    
}
}