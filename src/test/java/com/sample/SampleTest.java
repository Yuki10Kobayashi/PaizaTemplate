package com.sample;

import com.util.StandardInputSnatcher;
import com.util.StandardOutputSnatcher;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Samplクラスのテストクラス
 */
public class SampleTest {

    private StandardInputSnatcher in = new StandardInputSnatcher();
    private StandardOutputSnatcher out = new StandardOutputSnatcher();

    @Before
    public void setUp() throws Exception {
        System.setOut(out);
        System.setIn(in);
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
        System.setIn(null);
    }

    @Test
    public void tesSample() throws Exception {

        in.inputln("2");
        in.inputln("2,5");
        in.inputln("3,4");

        try {
            Sample.main(null);
            Assert.assertThat(out.redLine(), Is.is("hello = 2 , world = 5"));
            Assert.assertThat(out.redLine(), Is.is("hello = 3 , world = 4"));
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
            Assert.fail();
        }
    }
}