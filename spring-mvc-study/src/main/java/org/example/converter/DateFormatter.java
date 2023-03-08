package org.example.converter;

import org.springframework.format.Formatter;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter implements Formatter<Date> {
    String datePattern = "yyyy-MM-dd HH:mm:ss";

    @Override
    public Date parse(String text, Locale locale) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
        return simpleDateFormat.parse(text);
    }

    @Override
    public String print(Date object, Locale locale) {
        return new SimpleDateFormat().format(object);
    }
}
