package tech.strategio;

import static org.junit.jupiter.api.Assertions.assertEquals;

<<<<<<< HEAD
=======
import org.junit.jupiter.api.BeforeAll;
>>>>>>> penny_branch
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class shoppingCartTest {
<<<<<<< HEAD
  @BeforeEach
  public void createCart() {
    ShoppingCart shoppingCart = new ShoppingCart();
=======

  ShoppingCart shoppingCart;
  @BeforeEach
  public void createCart() {
      shoppingCart = new ShoppingCart();
>>>>>>> penny_branch
  }

  @Test
  public void emptyTest() {
    assertEquals(true, true);
  }
<<<<<<< HEAD
=======

  @Test
  public void zeroItemsWhenCreatedTest(){
    createCart();
    assertEquals(0, shoppingCart.getItemCount());
  }
>>>>>>> penny_branch
}