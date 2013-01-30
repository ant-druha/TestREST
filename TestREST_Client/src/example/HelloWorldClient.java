package example;/**
 * Created with IntelliJ IDEA.
 * User: Andrey.Dernov
 * Date: 1/29/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldClient {

  public static void main(String[] argv) {
      try {
          com.sun.net.httpserver.HttpServer server = com.sun.jersey.api.container.httpserver.HttpServerFactory.create("http://localhost:9998/");
          server.start();

          System.out.println("Server running");
          System.out.println("Visit: http://localhost:9998/helloworld");
          System.out.println("Hit return to stop...");
          System.in.read();
          System.out.println("Stopping server");
          server.stop(0);
          System.out.println("Server stopped");
      } catch (java.io.IOException ioe) {

          ioe.printStackTrace(System.err);


      }
  }
}