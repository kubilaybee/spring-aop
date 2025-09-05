### Annotations

**`@Before`**

- **Definition:** A type of "advice" that marks code to be executed immediately before a target method is run.
- **Purpose:** Used to perform preparatory or preventative actions before a method's execution. For example, conducting a security check or writing a log message before an operation.

**`@After`**

- **Definition:** A type of "advice" that marks code to be executed after a target method is completed, regardless of whether it was successful or threw an exception.
- **Purpose:** Used for tasks like releasing resources or notifying that an operation has finished. This code will execute even if an error is thrown.

**`@AfterReturning`**

- **Definition:** A type of "advice" that marks code to be executed only after a target method successfully completes and returns a value.
- **Purpose:** Used to perform specific actions only after successful method calls. It can access and manipulate the return value.

**`@AfterThrowing`**

- **Definition:** A type of "advice" that marks code to be executed when a target method throws an exception.
- **Purpose:** Used for special operations in error scenarios, such as logging, sending notifications, or managing the exception. You can specify which types of exceptions to handle.

**`@Around`**

- **Definition:** The most powerful type of "advice." It works by completely wrapping the target method, giving you control over its execution.
- **Purpose:** It can prevent a method call, call it multiple times, or modify the return value or the thrown exception. It is ideal for complex operations like measuring method performance.

### Terms

**Aspect Oriented Programming (AOP)**

- **Definition:** A programming paradigm that aims to modularize cross-cutting concerns (e.g., security, logging, transaction management) that repeat across different layers of an application.
- **Purpose:** To reduce code duplication, improve maintainability, and separate business logic from system concerns.

**AOP Concepts**

- **Definition:** The fundamental concepts that form the basis of AOP.
- **Purpose:** Used to define an **Aspect**, apply an **Advice**, and define a **Pointcut** at a **JoinPoint**.

**Pointcut**

- **Definition:** An expression that specifies which methods or **JoinPoints** will be targeted by an **Advice**.
- **Purpose:** Used to define where AOP should be applied. For example, it can specify all locations where `execute()` methods are called.

**Aspect**

- **Definition:** A module that consists of a combination of one or more "advice" and "pointcut" definitions.
- **Purpose:** Used to encapsulate a single cross-cutting concern, such as logging, security, or transaction management.

**Advice**

- **Definition:** The code that is executed when an **Aspect** matches a **Pointcut**.
- **Purpose:** Defines the action to be performed (e.g., printing a log message or starting a transaction).

**Weaver**

- **Definition:** The process by which an **Aspect** is applied to target objects, creating a new "proxy" object.
- **Purpose:** **AspectJ** performs this process at compile or load time. **Spring AOP** performs this process at runtime through "proxy" objects.

**JoinPoint**

- **Definition:** A specific moment during the execution of an application. For example, a method call or an exception being thrown.
- **Purpose:** Specifies the locations where an **Advice** can be applied. The AOP framework intervenes at these points.

**ProceedingJoinPoint**

- **Definition:** A special type of **JoinPoint** that can only be used with the `@Around` annotation.
- **Purpose:** Provides the ability to proceed with the target method call within the `@Around` advice using the `proceed()` method. This allows you to add custom code before and after the method's execution.
