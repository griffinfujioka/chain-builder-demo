package com.griffinfujioka.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fujiokg
 * @since 7/26/17
 */
@RestController
@RequestMapping(value = "/echo")
public class EchoController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> echo(@PathVariable String message) {
        return new ResponseEntity<>(String.format("echoing %s", message), HttpStatus.I_AM_A_TEAPOT);
    }
}
