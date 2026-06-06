package com.helton.json_place_holder.client;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.helton.json_place_holder.dto.UserDTO;

@Service
public class JsonPlaceholderClient {

  private final RestClient restClient;

  public JsonPlaceholderClient() {
    this.restClient = RestClient.create("https://mdn.github.io/learning-area");
  }

  // public List<UserDTO> fetchUsers() {
  //   return restClient.get()
  //       .uri("/javascript/oojs/json/superheroes.json")
  //       .retrieve()
  //       .body(new ParameterizedTypeReference<List<UserDTO>>() {
  //       });
  // }

  public UserDTO fetchUsers(){
    return restClient.get().uri("/javascript/oojs/json/superheroes.json")
    .retrieve()
    .body(UserDTO.class);
  }

}
