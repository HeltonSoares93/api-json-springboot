package com.helton.json_place_holder.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helton.json_place_holder.client.JsonPlaceholderClient;
import com.helton.json_place_holder.dto.UserDTO;

@RestController
@RequestMapping("/api/local-users")
public class UserController {

  private final JsonPlaceholderClient apiClient;

  public UserController(JsonPlaceholderClient apiClient) {
    this.apiClient = apiClient;
  }

  @GetMapping
  public List<UserDTO> getUsers() {
    return apiClient.fetchUsers();
  }
}
