package net.lecousin.ant.service.client.hierarchy;

import org.springframework.web.service.annotation.HttpExchange;

import net.lecousin.ant.core.springboot.service.client.LcAntServiceClient;
import net.lecousin.ant.service.hierarchy.HierarchyService;

@HttpExchange("/api/hierarchy/v1")
@LcAntServiceClient(serviceName = "hierarchy", serviceUrl = "${lc-ant.services.hierarchy:hierarchy-service}", qualifier = "hierarchyServiceRestClientV1")
public interface HierarchyServiceClientV1 extends HierarchyService {

}
