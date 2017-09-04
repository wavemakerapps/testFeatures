/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
package com.testfeatures.myjavaservice.controller;

import com.testfeatures.myjavaservice.MyJavaService;
import java.util.Date;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController
@RequestMapping(value = "/myJava")
public class MyJavaController {

    @Autowired
    private MyJavaService myJavaService;

    @RequestMapping(value = "/booleanPValue", method = RequestMethod.GET)
    public boolean getBooleanPValue() {
        return myJavaService.getBooleanPValue();
    }

    @RequestMapping(value = "/bytePValue", method = RequestMethod.GET)
    public byte getBytePValue() {
        return myJavaService.getBytePValue();
    }

    @RequestMapping(value = "/charPValue", method = RequestMethod.GET)
    public char getCharPValue() {
        return myJavaService.getCharPValue();
    }

    @RequestMapping(value = "/datePValue", method = RequestMethod.GET)
    public Date getDatePValue() {
        return myJavaService.getDatePValue();
    }

    @RequestMapping(value = "/doublePValue", method = RequestMethod.GET)
    public double getDoublePValue() {
        return myJavaService.getDoublePValue();
    }

    @RequestMapping(value = "/floatPValue", method = RequestMethod.GET)
    public float getFloatPValue() {
        return myJavaService.getFloatPValue();
    }

    @RequestMapping(value = "/intPValue", method = RequestMethod.GET)
    public int getIntPValue() {
        return myJavaService.getIntPValue();
    }

    @RequestMapping(value = "/longPValue", method = RequestMethod.GET)
    public long getLongPValue() {
        return myJavaService.getLongPValue();
    }

    @RequestMapping(value = "/shortPValue", method = RequestMethod.GET)
    public short getshortPValue() {
        return myJavaService.getshortPValue();
    }
}
