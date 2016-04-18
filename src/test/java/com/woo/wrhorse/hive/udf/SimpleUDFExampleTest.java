package com.woo.wrhorse.hive.udf;

import org.apache.hadoop.io.Text;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 2016/4/18.
 */
public class SimpleUDFExampleTest {
    @Test
    public void testUDF(){
        SimpleUDFExample simpleUDFExample = new SimpleUDFExample();
        Assert.assertEquals("Hello world", simpleUDFExample.evaluate(new Text("world")).toString());
    }

    public void testNULLCheck(){
        SimpleUDFExample simpleUDFExample = new SimpleUDFExample();
        Assert.assertNull(simpleUDFExample.evaluate(null));

    }
}
