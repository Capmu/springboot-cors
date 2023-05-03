# springboot-cors

### Notes
- when using Spring Security (just added it in the pom.xml file) it'll trigger to use spring security
  - and if we don't put the proper configuration, every API calls will return 401
  - to configure it, add this Bean in the configuration class (or Application class in this case)
    ```java
    @Bean
    public SecurityFilterChain chain(HttpSecurity http) throws Exception {
        http.cors();
        return http.build();
    }
    ```
  - for CORS customization to allow all Origins, add this Bean in configuration (or Application class in this case)
      ```java
      @Bean
      public WebMvcConfigurer cors() {
          return new WebMvcConfigurer() {
              @Override
              public void addCorsMappings(@NonNull CorsRegistry registry) {
                  registry.addMapping("/**")
                          .allowedOrigins("*")
                          .allowedMethods("*");
              }
          };
      }
      ```

### Reference
- [Configuring CORS with Spring Security and Spring Boot](https://www.youtube.com/watch?v=hZykPiUyn48&t=43s)