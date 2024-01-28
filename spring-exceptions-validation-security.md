## Spring Boot - Exception Handling | Bean Validation | Spring Security

### <ins>There're 2 ways to handle exceptions:</ins>

<ins>**1. way:**</ins> Create handleXYException() functions with @ExceptionHandler annotations in your Controllers.

<ins>**2. way:**</ins> Create GlobalExceptionHandler class to implement exception handling in one place.

**_links for the topic:_**

- https://medium.com/@jovannypcg/understanding-springs-controlleradvice-cd96a364033f
- https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-ann-rest-exceptions.html
- https://docs.spring.io/spring-framework/reference/web/webflux/controller/ann-advice.html
- https://docs.spring.io/spring-framework/reference/web/webflux/controller/ann-exceptions.html

## Handle Exceptions globally - basic steps

1. Create `GlobalExceptionHandler` class.
2. Add `@ControllerAdvice` or `@RestControllerAdvice` annotation on your `GlobalExceptionHandler` class.

   - **@ControllerAdvice:** make your class a global exception handler in the app, can throw simple custom serverside-rendered templates/error page htmls.
   - **@RestControllerAdvice:** Almost the same as simple ControllerAdvice, but it throws exceptions with details put into ResponseBody.

3. Create custom exception class which extends `Exception` eg.: `NotFoundException.java`
4. Define at least `@ExceptionHandler` on in `GlobalExceptionHandler` class.
   - Check my project code exmaple
5. Szövegezés

## Bean Validation
