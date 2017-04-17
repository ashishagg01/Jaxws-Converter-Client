package com.acc.websrvices.main;

import java.math.BigDecimal;

import com.acc.websrvices.document.Converter;
import com.acc.websrvices.document.ConverterPortType;

//import com.acc.websrvices.rpc.Converter;
//import com.acc.websrvices.rpc.ConverterPortType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Converter service = new Converter();
    	ConverterPortType hello = service.getConverterPort();
 
		System.out.println(hello.dollarToRupees(new BigDecimal(1)));

    }
}
