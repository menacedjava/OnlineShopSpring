//package org.example.demobarbershop.config;
//
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//import io.swagger.v3.oas.models.servers.Server;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class SwaggerConfig {
//    @Value("${server.url}")
//    private String url;
//
//    @Bean
//    public OpenAPI myOpenAPI() {
//
//        Server devServer = new Server();
//        devServer.setUrl(url);
//        devServer.setDescription("SERVER URL 🌐📃ℹ️🔍🙂");
//
//        Contact contact = new Contact();
//        contact.setEmail("www.google.uz");
//        contact.setName("Project X");
//        contact.setUrl("www.google.uz");
//
//        Info info = new Info()
//                .title("google.com Management API")
//                .version("1.0")
//                .contact(contact)
//                .description("This API exposes endpoints to manage tutorials.")
//                .termsOfService("https://www.bezkoder.com/terms")
//                .license(null);
//
////        SecurityRequirement securityRequirement = new SecurityRequirement()
////                .addList("Bearer Authentication");
//
////        Components components = new Components()
////                .addSecuritySchemes("Bearer Authentication", createAPIKeyScheme());
//
//        return new OpenAPI()
//                .info(info)
//                .servers(List.of(devServer));
////                .components(components);
//        // TODO JWT
////                .addSecurityItem(securityRequirement);
//    }
//
//    private SecurityScheme createAPIKeyScheme() {
//        return new SecurityScheme().type(SecurityScheme.Type.HTTP)
//                .bearerFormat("JWT")
//                .scheme("bearer");
//    }
//}
