package doafacil.docs;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerSettings {
	
	@Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("controllers")
                .pathsToMatch("/v1/**") 
                .build();
    }

}

	/*private Contact contact() {
        return new Contact(
                "Doa Fácil",
                "http://www.doafacil.com",
                "grupo@doafacil.com");
    }
	
    private ApiInfoBuilder apiInfo() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Projeto Doa Fácil");
        apiInfoBuilder.description("API da plataforma Doa Fácil");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("Licença - Unicarioca");
        apiInfoBuilder.licenseUrl("http://www.unicarioca.edu.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;

    }
    
    @Bean
    public Docket apiDetail() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        	docket.select()
                  .apis(RequestHandlerSelectors.basePackage("doafacil.controllers"))
                  .paths(PathSelectors.any())
                  .build()
                  .apiInfo(this.apiInfo().build())
                  .consumes(new HashSet<String>(Arrays.asList("application/json")))
                  .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
}*/

