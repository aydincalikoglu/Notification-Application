package com.gtu.translatednotification.model.enums;

import lombok.Getter;

@Getter
public enum MailType {
    DRAFT("draft"),
    SENT("sent");

    private String type;

    MailType(String type) {
        this.type = type;
    }
}
