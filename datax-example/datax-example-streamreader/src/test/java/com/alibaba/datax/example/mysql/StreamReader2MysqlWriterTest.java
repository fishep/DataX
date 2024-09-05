package com.alibaba.datax.example.mysql;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * @Author fly.fei
 * @Date 2024/8/29 17:30
 * @Desc
 **/
public class StreamReader2MysqlWriterTest {

    @Test
    public void testStreamReader2MysqlWriterTest() {
        String path = "/stream2mysql.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

    @Test
    public void testStreamReader2MysqlWriter4TmpTest() {
        String path = "/stream2mysql4tmp.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

}
