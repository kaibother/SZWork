/*
package pluto.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//这个转换器可以将请求的参数String 转成日期 Date
public class DateConveter implements Converter<String ,Date> {
    @Nullable
    @Override
    public Date convert(String s) {
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date=format.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
*/
