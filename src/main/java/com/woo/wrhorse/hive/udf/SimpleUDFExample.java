package com.woo.wrhorse.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Created by User on 2016/4/18.
 */
public class SimpleUDFExample extends UDF {
    public Text evaluate(Text input) {
        if(input==null) return null;
        return new Text("Hello " + input.toString());
    }
}
