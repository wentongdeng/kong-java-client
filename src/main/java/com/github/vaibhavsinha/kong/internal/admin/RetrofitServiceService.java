package com.github.vaibhavsinha.kong.internal.admin;

import com.github.vaibhavsinha.kong.model.admin.route.RouteList;
import com.github.vaibhavsinha.kong.model.admin.service.Service;
import com.github.vaibhavsinha.kong.model.admin.service.ServiceList;

public interface RetrofitServiceService {

    Service createService(Service request);


    Service getService(String nameOrId);

    Service updateService(String nameOrId,Service request);

    void deleteService(String nameOrId);

    ServiceList listServices(Long size, String offset);

    RouteList listServiceRoutes(String nameOrId);
}
