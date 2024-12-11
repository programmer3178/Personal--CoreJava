package com.tnsif.inheritance.multilevel;
/**
* @author sys
*/
public class Word extends WordPad {
    private boolean spellCheckEnabled;

    public Word(boolean spellCheckEnabled) {
        super();
        this.spellCheckEnabled = true;
       
    }

    Word() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
public void spellCheck(){
    if(spellCheckEnabled){
        System.out.println("Running spell check....");
        //Simulate spell check logic here
    }
    else{
        System.out.println("Spell check is disabled!");
    }
}
public void enableSpellCheck(boolean enable){
    spellCheckEnabled = enable;
    
}
}
