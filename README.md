Spring Boot Command Line

- add spring boot parent to parent pom
- add spring boot starter to project poms
- @ComponentScan for your top level (non-default )package is required or compilation errors result
- If you use @ComponentScan or @EnableAutoConfiguration you don't need @SpringBootApplication
- You don't need @Component or @Autowired on you Application class
- One of your classes should implement CommandLineRunner and override run() as your command line
