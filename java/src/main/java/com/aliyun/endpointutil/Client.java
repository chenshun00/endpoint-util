// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.endpointutil;

import com.aliyun.tea.ValidateException;
import com.aliyun.tea.utils.StringUtils;

public class Client {

    public static String getEndpointRules(String endpointType, String netWork, String regionId, String product, String suffix) throws Exception {
        String result;
        if (!StringUtils.isEmpty(netWork) && netWork != "public") {
            netWork = "-" + netWork;
        } else {
            netWork = "";
        }
        if (null == suffix) {
            suffix = "";
        }
        if (endpointType == "regional") {
            if (StringUtils.isEmpty(regionId)) {
                throw new ValidateException("RegionId is empty, please set a valid RegionId");
            }
            result = String.format("%s%s%s.%s.aliyuncs.com", product, suffix, netWork, regionId);
        } else {
            result = String.format("%s%s%s.aliyuncs.com", product, suffix, netWork);
        }
        return result;
    }
}
