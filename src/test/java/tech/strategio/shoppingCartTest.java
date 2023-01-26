package tech.strategio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class shoppingCartTest {

  ShoppingCart shoppingCart;
  @BeforeEach
  public void createCart() {
      shoppingCart = new ShoppingCart();
  }

  @Test
  public void emptyTest() {
    assertEquals(true, true);
  }

  @Test
  public void zeroItemsWhenCreatedTest(){
    createCart();
    assertEquals(0, shoppingCart.getItemCount());
  }
}