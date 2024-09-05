package com.alibaba.datax.example.mysql;

import com.alibaba.datax.example.ExampleContainer;
import com.alibaba.datax.example.util.PathUtil;
import org.junit.Test;

/**
 * @Author fly.fei
 * @Date 2024/8/29 16:47
 * @Desc
 **/
public class MysqlReader2StreamWriterTest {

    @Test
    public void testMysqlReader2StreamWriterTest() {
        String path = "/mysql2stream.json";
        String jobPath = PathUtil.getAbsolutePathFromClassPath(path);
        ExampleContainer.start(jobPath);
    }

}
