package com.tnsif.inheritance.multilevel;

/**
 * @author sys
 */
public class NotePad {

    protected String content;

    public NotePad() {
    }

    public NotePad(String content) {
        this.content = content;
    }

    public String displayContent() {
        return content;
    }
}
