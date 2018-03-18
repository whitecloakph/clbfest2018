pragma solidity ^0.4.17;

contract Adres {

  function Adres() public {
  }

  /* Product */

  struct Product {
    string name;
    string description;
    string serial;
  }

  event ProductCreated();

  Product[] private products;

  function createProduct(string _name, string _description, string _serial) public {
    products.push(Product({
      name: _name,
      description: _description,
      serial: _serial
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

  Order[] private orders;

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
  }

  event DisputeCreated();

  Dispute[] private disputes;

  function createDispute(uint _amount, string _message) public {
    disputes.push(Dispute({
      amount: _amount,
      message: _message
    }));
    DisputeCreated();
  }
}