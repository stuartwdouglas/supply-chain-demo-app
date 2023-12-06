package io.github.stuartwdouglas.hacbstest;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String... args) throws IOException {

        System.out.println("Saying Hello");
        Undertow.builder().addHttpListener(8080,"0.0.0.0")
                .setHandler(new HttpHandler() {
                    @Override
                    public void handleRequest(HttpServerExchange httpServerExchange) throws Exception {
                        httpServerExchange.getResponseSender().send("Hello");
                    }
                }).build().start();
    }

}
