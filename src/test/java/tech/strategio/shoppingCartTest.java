package tech.strategio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class shoppingCartTest {

  private ShoppingCart shoppingCart;
  @BeforeEach
  public void createCart() {

    shoppingCart = new ShoppingCart();
  }

  @Test
  public void emptyTest() {
    assertEquals(true, true);
  }

  @Test
  public void isCartEmpty() {
    shoppingCart.empty();
    assertEquals(0, shoppingCart.getItemCount(), 0.0001);}
}

