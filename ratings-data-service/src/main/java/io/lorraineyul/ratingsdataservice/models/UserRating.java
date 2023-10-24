package io.lorraineyul.ratingsdataservice.models;

import java.util.List;

public class UserRating {
  
  private List<Rating> UserRating;

  public List<Rating> getUserRating() {
    return this.UserRating;
  }

  public void setUserRating(List<Rating> UserRating) {
    this.UserRating = UserRating;
  }

}
