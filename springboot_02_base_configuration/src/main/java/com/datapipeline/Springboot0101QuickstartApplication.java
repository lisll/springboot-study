package com.datapipeline;

import com.datapipeline.controller.BookController;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext cxt = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        BookController bean = cxt.getBean(BookController.class);
        System.out.println("bean->"+ bean);
    }

}
