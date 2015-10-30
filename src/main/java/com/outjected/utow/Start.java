package com.outjected.utow;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.jboss.resteasy.plugins.server.undertow.UndertowJaxrsServer;

import io.undertow.Undertow;

public class Start {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Undertow.Builder builder = Undertow.builder().addHttpListener(1990, "0.0.0.0");
        UndertowJaxrsServer server = new UndertowJaxrsServer().start(builder);
        server.deploy(MyApp.class);
    }

    @ApplicationPath("/utow")
    public static class MyApp extends Application {
        @Override
        public Set<Class<?>> getClasses() {
            HashSet<Class<?>> classes = new HashSet<Class<?>>();
            classes.add(DemoString.class);
            classes.add(DemoXml.class);
            classes.add(DemoJson.class);
            return classes;
        }
    }
}
