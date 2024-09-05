package com.alibaba.datax.example.hana;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * @Author fly.fei
 * @Date 2024/8/30 10:14
 * @Desc
 **/
public class HanaReader2MysqlWriterTest {

    @Test
    public void testHanaReader2MysqlWriterTest() {
        String path = "/hana2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testHanaReader2MysqlWriter4QuoteTest() {
        String path = "/hana2mysql4quote.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testHanaReader2MysqlWriter4AllcolumnTest() {
        String path = "/hana2mysql4allcolumn.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testHanaReader2MysqlWriter4TmpTest() {
        String path = "/hana2mysql4tmp.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

}
