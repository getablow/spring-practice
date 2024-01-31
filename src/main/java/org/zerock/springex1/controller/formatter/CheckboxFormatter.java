package org.zerock.springex1.controller.formatter;

import org.springframework.format.Formatter;

import java.util.Locale;

public class CheckboxFormatter implements Formatter<Boolean> {

    @Override
    public Boolean parse(String text, Locale locale){
        if(text == null){
            return false;
        }
        return text.equals("on");
    }

    @Override
    public String print(Boolean object, Locale locale){
        return object.toString();
    }

}
