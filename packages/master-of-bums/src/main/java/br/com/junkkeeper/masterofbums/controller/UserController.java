package br.com.junkkeeper.masterofbums.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.junkkeeper.masterofbums.model.User;

@RestController
public class UserController {

  @RequestMapping(method = RequestMethod.GET, path = "/get/{name}")
  public String get (@PathVariable String name) {
    return String.format("get test - %s", name);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/get1")
  public String get1 (@PathParam("message") String message, @PathParam("name") String name) {
    return new User(message, name).toString();
  }
}
