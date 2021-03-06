package com.outspace.springbatch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/*
    Public interface ItemReader is used to get databy read() method.
    The read() method is called repeatedly then returning a difference value for each time
    If all data are consumed, a null value will be returned
*/

public class Reader implements ItemReader<String> {

    private String[] messages = {"Hello world!", "Welcome to Spring Batch"};

    private  int count = 0;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        if(count < messages.length) {
            return messages[count++];
        } else {
            count = 0;
        }
        return null;
    }
}
