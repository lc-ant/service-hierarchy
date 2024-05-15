package net.lecousin.ant.service.provider.hierarchy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import net.lecousin.ant.core.springboot.service.provider.LcAntServiceProvider;
import net.lecousin.ant.service.hierarchy.HierarchyService;

@Service("hierarchyServiceProvider")
@Primary
public class HierarchyServiceImpl implements HierarchyService, LcAntServiceProvider {

}
