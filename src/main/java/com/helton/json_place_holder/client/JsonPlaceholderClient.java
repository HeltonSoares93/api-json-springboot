package com.helton.json_place_holder.client;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.helton.json_place_holder.dto.UserDTO;

@Service
public class JsonPlaceholderClient {

  private final RestClient restClient;

  public JsonPlaceholderClient() {
    this.restClient = RestClient.create("https://jsonplaceholder.typicode.com");
  }

  public List<UserDTO> fetchUsers() {
    return restClient.get()
        .uri("/users")
        .retrieve()
        .body(new ParameterizedTypeReference<List<UserDTO>>() {
        });
  }

}
