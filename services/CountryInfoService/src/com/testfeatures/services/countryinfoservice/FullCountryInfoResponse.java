/*Copyright (c) 2015-2016 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testfeatures.services.countryinfoservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FullCountryInfoResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCountryInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fullCountryInfoResult"
})
@XmlRootElement(name = "FullCountryInfoResponse")
public class FullCountryInfoResponse {

    @XmlElement(name = "FullCountryInfoResult", required = true)
    protected TCountryInfo fullCountryInfoResult;

    /**
     * Gets the value of the fullCountryInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link TCountryInfo }
     *     
     */
    public TCountryInfo getFullCountryInfoResult() {
        return fullCountryInfoResult;
    }

    /**
     * Sets the value of the fullCountryInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCountryInfo }
     *     
     */
    public void setFullCountryInfoResult(TCountryInfo value) {
        this.fullCountryInfoResult = value;
    }

}
