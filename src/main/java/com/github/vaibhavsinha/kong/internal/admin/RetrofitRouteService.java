package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.route.Route;
import com.github.vaibhavsinha.kong.model.admin.route.RouteList;

public interface RetrofitRouteService {
    Route createRoute(Route request);

    Route getRoute(String  nameOrId);

    Route updateRoute(Route request);

    void deleteRoute(String nameOrId);

    RouteList listRoutes(Long size, String offset);
}
