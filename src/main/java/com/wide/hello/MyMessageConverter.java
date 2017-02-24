package com.wide.hello;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by Sai on 2017/2/22.
 */
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        super(new MediaType("application", "x-widely", Charset.forName("UTF-8")));
    }

    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }

    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "(" + demoObj.getId() + ", " + demoObj.getName() + ")";
        httpOutputMessage.getBody().write(out.getBytes());
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

}
