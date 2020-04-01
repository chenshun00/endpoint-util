package com.aliyun.endpointutil;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
    @Test
    public void getEndpointRulesTest() throws Exception {
        new Client();
        Assert.assertEquals("cs.region.aliyuncs.com", Client.getEndpointRules("regional", "public",
                "region", "cs"));
        Assert.assertEquals("cs-test.aliyuncs.com", Client.getEndpointRules("", "test",
                "region", "cs"));

        try {
            Client.getEndpointRules("regional", null,
                    null, "cs");
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("RegionId is empty, please set a valid RegionId", e.getMessage());
        }
    }
}
