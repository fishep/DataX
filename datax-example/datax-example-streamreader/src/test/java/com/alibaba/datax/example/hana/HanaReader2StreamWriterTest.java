package com.alibaba.datax.example.hana;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * @Author fly.fei
 * @Date 2024/8/30 10:14
 * @Desc
 **/
public class HanaReader2StreamWriterTest {

    @Test
    public void testHanaReader2StreamWriterTest() {
        String path = "/hana2stream.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testHanaReader2StreamWriter4QueryTest() {
        String path = "/hana2stream4query.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testHanaReader2StreamWriter4AllcolumnTest() {
        String path = "/hana2stream4allcolumn.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

}
