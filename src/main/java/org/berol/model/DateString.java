package org.berol.model;

import java.time.LocalDate;

public final class DateString {

    public DateString() { }

    public static String getDateString() {
        String[] reverseDate = LocalDate.now().toString().split("-");
        return  (reverseDate[2] + "/" + reverseDate[1] + "/" + reverseDate[0]);
    }
}
