package com.github.vaibhavsinha.kong.model.admin.service;

import lombok.Data;


/**
 * @program: kong-java-client
 * @description:
 * @author: Mr.Deng
 * @create: 2019-01-03 17:35
 **/
@Data
public class Service {

    private String id;
    private String name;
    private String host;
    private Integer port;
    private Integer read_timeout;
    private Integer write_timeout;
    private Integer connect_timeout;


    private String path;
    private String protocol;

    private Integer retries;

    private Long created_at;
    private Long updated_at;
}
