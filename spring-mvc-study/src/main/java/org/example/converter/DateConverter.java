package org.example.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter implements Converter<String,Date> {
   private final String  pattern = "yyyy-MM-dd HH:mm:ss";
    @Override
    public Date convert(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            return sdf.parse(source);
        }catch (ParseException e){
            throw new IllegalArgumentException("无效的日期格式，请使用正确格式："+pattern);
        }

    }
}
