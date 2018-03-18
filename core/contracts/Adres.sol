pragma solidity ^0.4.17;

contract Adres {

  function Adres() public {
  }

  /* Product */

  struct Product {
    string name;
    string description;
    string serial;
    string images; // comma separated
  }

  event ProductCreated();

  Product[] public products;

  function getProductsLength() public view returns (uint) {
      return products.length;
  }

  function createProduct(string _name, string _description, string _serial, string _images) public {
    products.push(Product({
      name: _name,
      description: _description,
      serial: _serial,
      images: _images
    }));
    ProductCreated();
  }

  /* Order */

  struct Order {
    address buyer;
    address seller;
    uint amount;
  }

  event OrderCreated();

  Order[] public orders;

  function getOrdersLength() public view returns (uint) {
      return orders.length;
  }

  function createOrder(address _buyer, address _seller, uint _amount) public {
    orders.push(Order({
      buyer: _buyer,
      seller: _seller,
      amount: _amount
    }));
    OrderCreated();
  }

  /* Dispute */

  struct Dispute {
    uint amount;
    string message;
    string images; // comma separated
  }

  event DisputeCreated();

  Dispute[] public disputes;

  function getDisputesLength() public view returns (uint) {
      return disputes.length;
  }

  function createDispute(uint _amount, string _message, string _images) public {
    disputes.push(Dispute({
      amount: _amount,
      message: _message,
      images: _images
    }));
    DisputeCreated();
  }
}
