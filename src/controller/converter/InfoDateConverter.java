package controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by adc333 on 2017/2/18.
 */
public class InfoDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {

        try{
            return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").parse(source);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
