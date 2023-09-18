package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.MemberDao;

@Configuration
@ComponentScan(basePackages = {"spring" },
excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class))
public class AppCtxWithExclude {
}
