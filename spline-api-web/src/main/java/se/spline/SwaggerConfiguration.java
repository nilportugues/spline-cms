package se.spline;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${info.app.version}")
    private String versionName;

    @Bean
    public Docket objectApiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("se.spline.api.*"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
		return new ApiInfo(
				applicationName,
				"Spline CMS API.",
                versionName,
				null,
				"rickard.andersson@svt.se",
				null,
				null
		);
	}
}
