package com.github.vaibhavsinha.kong.model.admin.route;

import com.github.vaibhavsinha.kong.model.common.AbstractEntityList;
import lombok.Data;

import java.util.List;

/**
 * @program: kong-java-client
 * @description:
 * @author: Mr.Deng
 * @create: 2019-01-03 19:29
 **/
@Data
public class RouteList extends AbstractEntityList {
    String next;
    List<Route> data;
}
