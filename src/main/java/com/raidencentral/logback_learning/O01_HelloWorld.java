package com.raidencentral.logback_learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

/**
 * Hello world!
 *
 */
public class O01_HelloWorld 
{
    public static void main( String[] args )
    {
       Logger logger = LoggerFactory.getLogger(O01_HelloWorld.class);
       
       logger.debug("Hello world");
       
       // print internal state
       LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
       StatusPrinter.print(lc);
       
    }
}
