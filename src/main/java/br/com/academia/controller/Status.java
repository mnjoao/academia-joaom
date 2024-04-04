package br.com.academia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Instant;

@RestController
@RequestMapping("/")
public class Status {

    @GetMapping
    public String status() throws UnknownHostException {
        return "V2 - Academia rodando " + Instant.now() + " Servidor [" + InetAddress.getLocalHost() +"]";
    }
}
