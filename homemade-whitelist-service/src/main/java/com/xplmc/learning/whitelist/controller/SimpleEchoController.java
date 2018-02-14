package com.xplmc.learning.whitelist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * homemade simple echo controller
 *
 * @author luke
 */
@RestController
public class SimpleEchoController {

    @GetMapping(("/simple/echo/{text}"))
    public Map<String, String> echo(@PathVariable("text") String text) {
        return Collections.singletonMap("text", text);
    }

}