package com.weirddev.testme.intellij.template.utils;

/**
 * Date: 15/11/2016
 *
 * @author Yaron Yamin
 */
public class ClassUtils {
    public String extractClassName(String canonicalName) {
        return canonicalName.substring(canonicalName.lastIndexOf('.') + 1 );
    }
    public String stripGenerics(String canonicalName) {
        return canonicalName.replaceFirst("<.*","");
    }
    public String replaceType(String type,String replacementType){
       return type.replaceFirst(stripGenerics(type).replace(".", "\\."), replacementType);
    }
}