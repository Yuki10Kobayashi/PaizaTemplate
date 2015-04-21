package com.sample;

import com.util.StandardInputSnatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Samplクラスのテストクラス
 */
public class SampleTest {

    private StandardInputSnatcher in = new StandardInputSnatcher();

    @Before
    public void setUp() throws Exception {
        System.setIn(in);
    }

    @After
    public void tearDown() throws Exception {
        System.setIn(null);
    }

    @Test
    public void tesSample() throws Exception {

        in.inputln("2");
        in.inputln("2,5");
        in.inputln("3,4");

        try {
            Sample.main(null);
        } catch (Exception e) {

        }
    }
}