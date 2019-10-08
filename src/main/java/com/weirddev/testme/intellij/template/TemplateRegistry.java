package com.weirddev.testme.intellij.template;

import com.weirddev.testme.intellij.template.context.Language;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/12/2016
 *
 * @author Yaron Yamin
 */
public class TemplateRegistry {

    static private final List<TemplateDescriptor> templateDescriptors = new ArrayList<>();

    public static final String JUNIT4_MOCKITO_JAVA_TEMPLATE = "TestMe with JUnit4 & Mockito.java";
    public static final String JUNIT5_MOCKITO_JAVA_TEMPLATE = "TestMe with JUnit5 & Mockito.java";
    public static final String TESTNG_MOCKITO_JAVA_TEMPLATE = "TestMe with TestNG & Mockito.java";
    public static final String JUNIT4_MOCKITO_GROOVY_TEMPLATE = "TestMe with Groovy, JUnit4 & Mockito.groovy";
    public static final String SPOCK_MOCKITO_GROOVY_TEMPLATE = "TestMe with Groovy, Spock & Mockito.groovy";

    static {
/*
        //html version (has issues with horizontal alignment of img to text in JLabel):
        URL juDark = TemplateRegistry.class.getResource("/icons/junit_dark.png");
        URL mockito = TemplateRegistry.class.getResource("/icons/mockito.png");
        URL ju5 = TemplateRegistry.class.getResource("/icons/junit5.png");
        templateDescriptors.add(new TemplateDescriptor("<html>with <i><b>JUnit4</b></i><img src='"+ juDark +"'> & <i><b>Mockito</b></i><img src='"+ mockito +"'></html>", "TestMe with JUnit4 & Mockito.java"));
        templateDescriptors.add(new TemplateDescriptor("<html>with <i><b>JUnit5</b></i><img src='"+ ju5 +"'> & <i><b>Mockito</b></i><img src='"+ mockito +"'></html>", "TestMe with JUnit4 & Mockito.java"));
*/
        templateDescriptors.add(new TemplateDescriptor("JUnit & Mockito", JUNIT4_MOCKITO_JAVA_TEMPLATE, Language.Java));
        templateDescriptors.add(new TemplateDescriptor("Spock", SPOCK_MOCKITO_GROOVY_TEMPLATE, Language.Groovy));
    }
    public List<TemplateDescriptor> getTemplateDescriptors(){
        return templateDescriptors;
    }
}
