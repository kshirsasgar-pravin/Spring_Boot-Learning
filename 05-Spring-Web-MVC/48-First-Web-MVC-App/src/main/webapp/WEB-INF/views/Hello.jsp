I want you to act as a BEGINNER-LEVEL BUT PROFESSIONAL JAVA BACKEND DEVELOPER and PROJECT ARCHITECT.

I will provide you with my complete existing DryFruitHouse project.

Your responsibility has TWO PHASES:

PHASE 1:
Thoroughly analyze the existing project.

PHASE 2:
Based on your analysis, generate ONE FINAL, DETAILED, IMPLEMENTATION-READY PROMPT that I can directly give to Antigravity to complete and professionally improve the project.

IMPORTANT:
You are NOT going to implement or modify the project yourself.

You are going to analyze it and then generate the final prompt for the AI coding agent that will implement it.

==================================================
PROJECT
==================================================


==================================================
STRICT TECHNOLOGY AND CODING STYLE RULE
==================================================

THIS IS A CRITICAL REQUIREMENT.

The completed project MUST remain within the technology stack that already exists in the project.

DO NOT introduce new technologies simply because they may be considered more modern or professional.

DO NOT introduce:

- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security
- REST frameworks
- React
- Angular
- Node.js
- Docker
- Microservices
- Lombok
- MapStruct
- new ORM frameworks
- new authentication frameworks
- new payment frameworks
- new database technologies
- unnecessary third-party libraries
- unnecessary Maven dependencies
- unnecessary design patterns

Unless a technology is ALREADY PRESENT in the project, do not introduce it.

If an existing requirement can be completed using the technologies already present, ALWAYS use the existing technology.

The goal is NOT to modernize the technology stack.

The goal is to COMPLETE and IMPROVE THE EXISTING PROJECT.

==================================================
EXISTING CODING STYLE MUST BE PRESERVED
==================================================

Before recommending or implementing any change, analyze the existing project's coding style.

Study the actual code and identify:

- package naming style
- class naming style
- method naming style
- variable naming style
- constructor style
- getter/setter style
- indentation
- formatting
- import organization
- access modifiers
- exception handling style
- logging style
- Servlet structure
- doGet/doPost structure
- switch/action handling
- Service implementation style
- DAO implementation style
- Hibernate Session usage
- transaction handling style
- HQL style
- validation style
- response/redirect style
- JSP coding style
- naming conventions
- comments/documentation style

The remaining implementation MUST follow the SAME coding style wherever reasonably possible.

Do not introduce a completely different coding style into only the newly created files.

New files must look like they were written as part of the SAME PROJECT by the SAME DEVELOPER.

==================================================
DO NOT "IMPROVE" THE STYLE UNNECESSARILY
==================================================

Do not change existing code merely because another coding style may be considered better.

For example:

If the project uses:
Servlet → Service → DAO

continue using:

Servlet → Service → DAO.

If the project uses:
Hibernate Session directly in DAO,

continue using that approach.

If the project uses:
ServiceImpl classes,

continue using ServiceImpl.

If the project uses:
simple POJO entities with getters/setters,

continue using that style.

If the project uses:
try/catch inside Servlet action methods,

do not suddenly introduce a completely different global exception architecture.

If the project uses:
switch(action) in Servlets,

continue using that pattern where appropriate.

Only change the existing style when the current implementation causes an actual functional, security, correctness, or maintainability problem.

==================================================
NO UNNECESSARY DEPENDENCIES
==================================================

Before adding any Maven dependency, check pom.xml.

Ask:

1. Is the required functionality already possible with an existing dependency?
2. Can it be implemented using Java/Jakarta/Hibernate APIs already present?
3. Is the dependency genuinely necessary?

If the answer is yes to either of the first two questions:

DO NOT ADD A NEW DEPENDENCY.

If a new dependency is genuinely required:

- explain why it is required
- explain why the existing stack cannot handle it
- use the smallest and most appropriate dependency
- do not introduce a framework when a simple library/API is sufficient

==================================================
BEGINNER-FRIENDLY PROFESSIONAL IMPLEMENTATION
==================================================

The final implementation should be professional WITHOUT being unnecessarily complicated.

The developer should be able to understand the code during an interview.

Prefer:

- simple Java
- straightforward control flow
- clear method responsibilities
- existing project patterns
- readable code
- minimal abstraction
- existing technologies

Avoid:

- over-engineering
- unnecessary interfaces
- unnecessary DTOs
- unnecessary factories
- unnecessary builders
- unnecessary wrappers
- unnecessary generic abstractions
- complex functional programming
- advanced frameworks

Professional does NOT mean complicated.

Professional means:

- correct
- secure
- maintainable
- consistent
- readable
- properly separated
- tested
- reliable

==================================================
FINAL IMPLEMENTATION CONSISTENCY
==================================================

When generating the final Antigravity prompt, explicitly instruct Antigravity:

"Your implementation must look like a natural continuation of the existing project.

Do not make the new code look like it came from a completely different developer.

First study the existing coding style and architecture.

Then implement the remaining functionality using the same style, structure, naming conventions, exception-handling approach, Hibernate approach, Servlet approach, Service approach, DAO approach, and dependency set wherever possible."

==================================================
HARD RULE
==================================================

If you have two possible solutions:

Solution A:
Uses the technologies and coding patterns already present in the project.

Solution B:
Introduces a new technology/framework or significantly changes the coding style.

ALWAYS choose Solution A unless it is technically impossible or creates a serious correctness/security problem.

Do not introduce technology just because it is newer, more popular, or considered more enterprise-level.


Project Name:
DryFruitHouse

Project Type:
Online Dry Fruits E-Commerce Web Application

Current Technology Stack:

- Java 21
- Maven
- Jakarta Servlet
- JSP
- Hibernate ORM
- PostgreSQL
- Apache Tomcat 10.1
- HTML
- CSS
- JavaScript
- Razorpay
- BCrypt
- Jackson

Current intended architecture:

Browser
   ↓
JSP
   ↓
Servlet
   ↓
Service
   ↓
DAO
   ↓
Hibernate
   ↓
PostgreSQL

The existing architecture should be preserved.

Do NOT redesign the project into Spring Boot, Spring MVC, Spring Data JPA, REST-only architecture, microservices, or another framework.

==================================================
PHASE 1 — COMPLETE PROJECT ANALYSIS
==================================================

First, inspect the ENTIRE project I provide.

Do not assume anything.

Analyze the actual files and actual implementation.

Analyze:

- project structure
- packages
- entities
- enums
- DAO interfaces
- DAO implementations
- service interfaces
- service implementations
- servlets
- JSPs
- utility classes
- configuration
- Hibernate configuration
- Maven configuration
- authentication
- session management
- authorization
- payment integration
- Razorpay integration
- database interactions

For every important component determine:

- what it currently does
- whether it is correct
- whether it is complete
- whether it is partially complete
- whether it is broken
- whether it is unnecessary
- whether it should be modified
- whether it should remain unchanged

Clearly distinguish:

EXISTING
COMPLETE
PARTIALLY COMPLETE
BROKEN
MISSING
REQUIRED CHANGE

==================================================
ANALYZE THE ARCHITECTURE
==================================================

Verify whether the current project properly follows:

JSP
 ↓
Servlet
 ↓
Service
 ↓
DAO
 ↓
Hibernate
 ↓
PostgreSQL

Check whether:

- Servlets contain business logic
- Services contain business logic
- DAOs contain database logic
- JSPs contain excessive Java/business logic
- DAO is bypassed
- Service is bypassed
- responsibilities are duplicated

Recommend only necessary changes.

Do not over-engineer.

==================================================
ANALYZE ALL CURRENT MODULES
==================================================

Analyze:

1. Authentication
2. User
3. Category
4. Product
5. Cart
6. CartItem
7. Address
8. Checkout
9. Payment
10. Razorpay
11. Order
12. OrderItem
13. Admin
14. Session
15. Authorization
16. Exception handling
17. Hibernate
18. PostgreSQL
19. Security

For each module determine its current status and remaining work.

==================================================
ANALYZE THE COMPLETE CUSTOMER FLOW
==================================================

Trace the actual workflow:

Login
 ↓
Browse Products
 ↓
Product Details
 ↓
Add to Cart
 ↓
View Cart
 ↓
Update Cart
 ↓
Remove Cart Item
 ↓
Checkout
 ↓
Address
 ↓
Payment Selection
 ↓
COD / Online Payment
 ↓
Order Creation
 ↓
Stock Update
 ↓
Cart Clearing
 ↓
Order Confirmation
 ↓
My Orders
 ↓
Order Details
 ↓
Cancel Order

For EVERY step identify:

- JSP involved
- Servlet involved
- Service involved
- DAO involved
- Entity involved
- database operation
- current implementation
- missing implementation
- incorrect implementation

==================================================
ANALYZE COD FLOW
==================================================

Determine the correct implementation for:

Checkout
 ↓
Select COD
 ↓
PaymentServlet
 ↓
PaymentService
 ↓
Create COD Payment
 ↓
Create Order
 ↓
Create OrderItems
 ↓
Update Stock
 ↓
Clear Cart
 ↓
Order Confirmation

Determine:

- payment status
- transaction ID
- payment gateway value
- order status
- when the order should be created
- when stock should be reduced
- when cart should be cleared
- what happens if something fails

==================================================
ANALYZE ONLINE PAYMENT FLOW
==================================================

Determine the correct implementation for:

Checkout
 ↓
PaymentServlet
 ↓
PaymentService
 ↓
Razorpay Order
 ↓
Razorpay Checkout
 ↓
Customer Payment
 ↓
Razorpay Response
 ↓
Server-side Signature Verification
 ↓
Payment SUCCESS
 ↓
Order Creation
 ↓
Stock Update
 ↓
Cart Clearing
 ↓
Order Confirmation

Analyze:

- Razorpay Order ID
- Application Order ID
- Payment ID
- Signature
- Payment status
- Order status
- failure handling
- duplicate payment handling
- payment verification
- order creation timing

Pay particular attention to the relationship:

Payment ↔ Order

Determine whether the current entity design creates a sequencing problem.

==================================================
ANALYZE ORDERSERVLET
==================================================

Inspect the existing OrderServlet.

Determine:

- current actions
- save action
- view action
- cancel action
- update action
- admin actions

Determine which responsibilities actually belong in OrderServlet.

If a save/place-order action conflicts with the intended payment flow, explain how it should be handled.

The final architecture should not create duplicate order-creation paths unnecessarily.

==================================================
ANALYZE PAYMENTSERVLET
==================================================

Determine whether PaymentServlet exists.

If missing, identify exactly what it must do.

PaymentServlet should handle HTTP-level payment operations.

Payment business logic must remain in PaymentService.

Do not put Razorpay business logic directly inside the servlet.

==================================================
ANALYZE SERVICE LAYER
==================================================

Inspect all Service interfaces and implementations.

Identify:

- missing methods
- incorrect methods
- duplicated logic
- incorrect business logic
- validation problems
- transaction problems
- incorrect interactions between services

Pay special attention to:

- CartService
- ProductService
- PaymentService
- OrderService
- UserService

==================================================
ANALYZE DAO LAYER
==================================================

Inspect all DAO interfaces and implementations.

Check:

- HQL
- entity names
- property paths
- joins
- parameters
- null handling
- transaction handling
- rollback handling
- ownership checks
- lazy loading
- duplicate queries
- missing queries

Identify every issue that can prevent the application from working correctly.

==================================================
ANALYZE HIBERNATE
==================================================

Inspect:

- entity relationships
- primary keys
- foreign keys
- ID generation
- OneToOne
- OneToMany
- ManyToOne
- FetchType
- cascade
- orphanRemoval
- nullable constraints
- enum mapping
- transaction boundaries

Do not blindly change relationships.

Only recommend changes when necessary.

==================================================
ANALYZE SECURITY
==================================================

Check:

- login
- password hashing
- sessions
- authentication
- authorization
- user ownership
- admin access
- request parameter manipulation
- payment security

Ensure:

- userId is taken from authenticated session
- users cannot access other users' orders
- users cannot manipulate another user's cart
- admin operations are protected
- Razorpay secret is never exposed
- payment success is never trusted from the browser
- Razorpay signature is verified server-side

==================================================
DETERMINE ALL REMAINING WORK
==================================================

Create a complete list of what is remaining.

Divide it into:

CRITICAL
IMPORTANT
OPTIONAL

Because this project must be completed quickly, prioritize the complete customer shopping flow first.

==================================================
DETERMINE HOW THE REMAINING WORK SHOULD BE IMPLEMENTED
==================================================

For every remaining task determine:

- exact file(s) to modify
- new file(s) required
- existing method to reuse
- existing method to modify
- method responsibility
- expected request flow
- expected service flow
- expected DAO flow
- expected database result
- success handling
- failure handling
- validation
- security considerations
- testing requirements

Do not generate implementation code during this analysis phase.

==================================================
PROFESSIONAL QUALITY TARGET
==================================================

The final project should be:

- professional
- clean
- maintainable
- secure
- interview-ready
- logically structured
- easy to explain

But it must still be understandable for a beginner-level Java developer.

Do NOT over-engineer.

Do NOT introduce unnecessary technologies.

Do NOT rewrite working modules without reason.

==================================================
PHASE 2 — GENERATE THE FINAL ANTIGRAVITY PROMPT
==================================================

After completing the entire analysis, generate ONE FINAL MASTER PROMPT.

This prompt will be copied DIRECTLY into Antigravity.

The final prompt must tell Antigravity to:

1. Inspect the actual project before changing anything.

2. Compare the actual project with your analysis.

3. Preserve the existing architecture.

4. Preserve working functionality.

5. Implement only the required remaining work.

6. Make the project professional and interview-ready.

7. Use:
   - Java 21
   - Jakarta Servlet
   - JSP
   - Hibernate ORM
   - PostgreSQL
   - Maven
   - Razorpay
   - existing project dependencies

8. Do not introduce:
   - Spring Boot
   - Spring MVC
   - Spring Data JPA
   - new ORM
   - unnecessary frameworks
   - unnecessary design patterns

9. Follow:

JSP
 ↓
Servlet
 ↓
Service
 ↓
DAO
 ↓
Hibernate
 ↓
PostgreSQL

10. Implement the remaining work in logical phases.

11. Complete the complete customer flow.

12. Complete COD.

13. Complete Razorpay online payment.

14. Correctly integrate Payment and Order.

15. Complete OrderServlet.

16. Complete Address/Checkout where required.

17. Implement proper validation.

18. Implement proper authentication and authorization.

19. Protect order ownership.

20. Verify Razorpay payment signatures server-side.

21. Protect Razorpay secret credentials.

22. Handle transaction consistency.

23. Handle exceptions professionally.

24. Correct broken HQL/database operations.

25. Test every major workflow.

==================================================
ANTIGRAVITY IMPLEMENTATION RULE
==================================================

The final prompt MUST instruct Antigravity to work using:

ANALYZE
 ↓
PLAN
 ↓
IMPLEMENT
 ↓
COMPILE
 ↓
TEST
 ↓
FIX
 ↓
VERIFY
 ↓
NEXT PHASE

Do not blindly modify the entire project at once.

Before each major change:

- inspect the existing implementation
- understand dependencies
- make the minimum required change

After each major change:

- compile
- test
- fix errors
- verify existing functionality

==================================================
INTERVIEW REQUIREMENT
==================================================

The completed project should allow me to confidently explain:

- MVC
- Servlet
- Service Layer
- DAO Pattern
- Hibernate
- PostgreSQL
- Entity relationships
- Authentication
- Session management
- Authorization
- Cart
- Checkout
- COD
- Razorpay
- Payment verification
- Order creation
- OrderItems
- Stock management
- Transaction management
- Exception handling

Do not introduce implementation that is unnecessarily complicated for an interview.

==================================================
FINAL OUTPUT FORMAT
==================================================

Your response must have TWO major sections.

SECTION 1:
PROJECT ANALYSIS

Include:

- Current architecture
- Module status
- Complete workflow
- COD workflow
- Online payment workflow
- Order workflow
- Payment workflow
- Problems
- Remaining work
- Recommended implementation
- Priority
- Risks
- Testing requirements

SECTION 2:
FINAL ANTIGRAVITY MASTER PROMPT

This section must contain ONLY the final prompt that I can copy and paste directly into Antigravity.

The final Antigravity prompt must be based on the ACTUAL project analysis.

Do not invent files, classes, methods, or functionality.

Do not generate generic advice.

Make the prompt specific to the actual project.

==================================================
IMPORTANT
==================================================

I have only 2 days before my interview.

Therefore:

Priority 1:
Make the complete customer shopping flow work.

Priority 2:
Make payment/order integration correct and secure.

Priority 3:
Make order management work.

Priority 4:
Fix important Hibernate/DAO/transaction issues.

Priority 5:
Professional cleanup and testing.

Do not waste time on features that are not required for demonstrating the project.

Now inspect the complete project I provide and perform the analysis.

After the analysis, generate the FINAL ANTIGRAVITY MASTER PROMPT.