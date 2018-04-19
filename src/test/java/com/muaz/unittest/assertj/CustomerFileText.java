package com.muaz.unittest.assertj;


import com.muaz.unittest.customer.exception.MailServerUnavailableException;
import org.junit.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

public class CustomerFileText {


    @Test
    public void testFiles() throws Exception{
        File file=new File("C:\\Users\\muazt\\IdeaProjects\\UnitTestExamples\\src\\test\\resources");

        assertThat(file)
                .exists()
                .canRead()
                .canWrite()
                .hasExtension("txt")
                .hasName("text.txt");

        assertThat(contentOf(file))
                .startsWith("muaz");
    }

    @Test
    public void testException() throws Exception{
        Exception exception=new MailServerUnavailableException("test is a test");
        assertThat(exception)
                .hasMessage("this is a test")
                .isInstanceOf(MailServerUnavailableException.class)
                .hasMessageContaining("is a");
    }
}
