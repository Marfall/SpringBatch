package com.outspace.springbatch.step;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/*
    Public interface ItemWriter is used to generate output of batch processing.
    The write() method get a list of items from reader (or batch processor) to process.
    The data can be persisted to database or other storage, or simple show on a console...
 */

public class Writer implements ItemWriter<String > {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void write(List<? extends String> messages) throws Exception {

        for (String msg : messages) {
            System.out.println("Writer Step: " + msg);
        }
    }
}
