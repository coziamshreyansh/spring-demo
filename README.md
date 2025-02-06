# spring-demo


starter - it is the bundle of all the dependencies required in a project 

server -
Spring Boot, you don't need to manually set up a separate server because it comes with an embedded server inside the .jar file. The commonly used embedded servers in Spring Boot are:
1. Tomcat (Default in Spring Boot)
   ✅ Pros:

Most widely used and well-documented.
Good for traditional blocking (thread-per-request) model.
Strong community support and stability.
❌ Cons:

Slightly heavier compared to Jetty and Undertow.
Lower performance in handling high concurrent requests compared to Undertow.
🛠 Best For: General-purpose web applications with moderate traffic.


2. Jetty
   ✅ Pros:

Lightweight and faster than Tomcat.
Supports both blocking and non-blocking (async) I/O models.
Better suited for WebSockets and microservices due to async features.
❌ Cons:

Less widely used than Tomcat, so community support is smaller.
Requires more tuning for optimal performance.
🛠 Best For: Applications needing WebSockets, high concurrency, and async processing.

3. Undertow
   ✅ Pros:

Fastest among the three, thanks to its non-blocking, event-driven architecture.
Low memory footprint, great for high-concurrency applications.
Used internally by Quarkus and WildFly.
❌ Cons:

Less mature ecosystem compared to Tomcat.
Requires deeper understanding for custom configurations.
🛠 Best For: High-performance microservices and applications needing high throughput.

Which One Should You Choose?
✅ Tomcat → Default, stable, best for general-purpose apps.
✅ Jetty → If you need WebSockets, async processing, or lower memory usage.
✅ Undertow → If you need the best performance with high concurrency.