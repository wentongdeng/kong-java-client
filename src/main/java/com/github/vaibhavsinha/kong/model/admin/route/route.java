package com.github.vaibhavsinha.kong.model.admin.route;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * @program: kong-java-client
 * @description:
 * @author: Mr.Deng
 * @create: 2019-01-03 17:35
 **/
@Data
public class route {

    private String id;
    private Long created_at;
    private Long updated_at;
    private String[] protocols;
    private String[] methods;
    private String[] hosts;
    private String[] paths;
    private Integer regex_priority;
    private Boolean strip_path;
    private Boolean preserve_host;
    private JSONObject service;
}
