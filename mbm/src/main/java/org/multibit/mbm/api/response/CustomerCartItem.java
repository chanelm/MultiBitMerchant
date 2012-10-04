package org.multibit.mbm.api.response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.multibit.mbm.db.dto.CartItem;
import org.multibit.mbm.db.dto.Item;

/**
 *  <p>Value object to provide the following to {@link org.multibit.mbm.resources.CustomerCartResource}:</p>
 *  <ul>
 *  <li>Defines part of a Customer request entity</li>
 *  </ul>
 *
 * @since 0.0.1
 *         
 */
@Deprecated
public class CustomerCartItem {

  @JsonProperty
  private Long id;

  @JsonProperty
  private int quantity;

  /**
   * Default constructor to allow request building
   */
  public CustomerCartItem() {
  }

  /**
   * Utility constructor for mandatory fields
   *
   * @param itemId   The Item id
   * @param quantity The quantity required
   */
  public CustomerCartItem(Long itemId, int quantity) {
    this.id = itemId;
    this.quantity = quantity;
  }

  /**
   * Utility constructor using DTOs
   *
   * @param cartItem The link between a Cart and the Item
   */
  public CustomerCartItem(CartItem cartItem) {
    Item item = cartItem.getItem();
    this.id = item.getId();
    this.quantity = cartItem.getQuantity();
  }

  public Long getId() {
    return id;
  }

  public int getQuantity() {
    return quantity;
  }
}
