package com.epam.training.ws.service.exception;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegativeSumException", propOrder = { "message" })
public class NegativeSumException {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String value) {
        this.message = value;
    }
}
