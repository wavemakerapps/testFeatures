/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testfeatures.myjavaservice;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;


import com.wavemaker.runtime.security.SecurityService;
import com.wavemaker.runtime.service.annotations.ExposeToClient;
import com.wavemaker.runtime.service.annotations.HideFromClient;
import org.springframework.beans.factory.annotation.Value;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

//import com.testfeatures.myjavaservice.model.*;

/**
 * This is a singleton class with all its public methods exposed as REST APIs via generated controller class.
 * To avoid exposing an API for a particular public method, annotate it with @HideFromClient.
 *
 * Method names will play a major role in defining the Http Method for the generated APIs. For example, a method name
 * that starts with delete/remove, will make the API exposed as Http Method "DELETE".
 *
 * Method Parameters of type primitives (including java.lang.String) will be exposed as Query Parameters &
 * Complex Types/Objects will become part of the Request body in the generated API.
 */
@ExposeToClient
public class MyJavaService {

    private static final Logger logger = LoggerFactory.getLogger(MyJavaService.class);

     @Value("${app.environment.intPrimitiveValue}")
        private int intPValue;

    public int getIntPValue(){
        return intPValue;
    }

    @Value("${app.environment.floatPrimitiveValue}")
        private float floatPValue;

    public float getFloatPValue(){
        return floatPValue;
    }

    @Value("${app.environment.doublePrimitiveValue}")
        private double doublePValue;

    public double getDoublePValue(){
        return doublePValue;
    }

    @Value("${app.environment.charPrimitiveValue}")
        private char charPValue;

    public char getCharPValue(){
        return charPValue;
    }

    @Value("${app.environment.booleanPrimitiveValue}")
        private boolean booleanPValue;

    public boolean getBooleanPValue(){
        return booleanPValue;
    }

    @Value("${app.environment.longPrimitiveValue}")
        private long longPValue;

    public long getLongPValue(){
        return longPValue;
    }

    @Value("${app.environment.shortPrimitiveValue}")
        private short shortPValue;

    public short getshortPValue(){
        return shortPValue;
    }

    @Value("${app.environment.bytePrimitiveValue}")
        private byte bytePValue;

    public byte getBytePValue(){
        return bytePValue;
    }

    @Value("${app.environment.dateValue}")
        private String datePValue;

    public Date getDatePValue(){
        try{
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(datePValue);
        return date;
        }catch(ParseException e){
            throw new RuntimeException("Parse Exception");
        }catch(Exception e){
            throw new RuntimeException("Exception",e);
        }
    }

}
