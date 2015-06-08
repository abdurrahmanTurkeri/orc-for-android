/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.sampleservice;



/**
 * The type Another Entity.
*/
public class AnotherEntity extends Entity {

    public AnotherEntity(){
        setODataType("#Microsoft.SampleService.AnotherEntity");
    }
            
    private String SomeString;
     
    /**
    * Gets the Some String.
    *
    * @return the String
    */
    public String getSomeString() {
        return this.SomeString; 
    }

    /**
    * Sets the Some String.
    *
    * @param value the String
    */
    public void setSomeString(String value) { 
        this.SomeString = value; 
        valueChanged("SomeString", value);

    }
}

