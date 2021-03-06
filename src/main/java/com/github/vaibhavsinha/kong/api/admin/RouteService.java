package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import com.github.vaibhavsinha.kong.model.admin.route.RouteList;

public interface RouteService {

    Route createRoute(Route request);

    Route getRoute(String  nameOrId);

    Route updateRoute(Route request);

    void deleteRoute(String nameOrId);

    RouteList listRoutes(Long size, String offset);
}
