package com.outspace.springbatch.step;

import org.springframework.batch.item.ItemProcessor;

/*
     Public interface ItemProcessor is used for transforming data.
     We can provide input and output data type for each ItemProcessor via.
     A null returning is a finally signal of the processing.
 */

public class Processor implements ItemProcessor<String ,String> {

    @Override
    public String process(String content) throws Exception {
        return content.toUpperCase();
    }
}
