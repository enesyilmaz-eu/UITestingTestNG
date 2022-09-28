package com.cydeo.TestNGexamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @DataProvider(name="TwoSetOfData")
    public Object[][] provide2Data(){

        return new Object[][]{
                {"Adam",20},
                {"Alice",25},
                {"Mary",26}
        };
    }

        @Test(dataProvider = "TwoSetOfData")
                public void testData(String name,int batch){
            System.out.println(name+" is from batch "+batch);
        }
    }

