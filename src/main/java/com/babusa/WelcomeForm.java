package com.babusa;

import org.apache.struts.action.ActionForm;

public class WelcomeForm extends ActionForm {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
