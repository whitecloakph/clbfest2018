pragma solidity ^0.4.17;
contract Order {

    address private buyer;
    address private seller;
    string private name;
    string private serialNumber;
    uint256 private timestamp;
    uint private warrantyMilliseconds1;
    uint private warrantyMilliseconds2;
    uint private status;
    uint private amount;

    function Order(address _buyer, address _seller, string _name, string _serialNumber, uint256 _timestamp
            uint _warrantyMilliseconds1, uint _warrantyMilliseconds2, uint _status, uint _amount) public {
        buyer = _buyer;
        seller = _seller;
        name = _name;
        serialNumber = _serialNumber;
        timestamp = _timestamp;
        warrantyMilliseconds1 = _warrantyMilliseconds1;
        warrantyMilliseconds2 = _warrantyMilliseconds2;
        status = _status;
        amount = _amount;
    }
    
    function getBuyer() public view returns (string) {
        return buyer;
    }

    function setName(string _name) public {
        name = _name;
    }

    function getName() public view returns (string) {
        return name;
    }

    function setName(string _name) public {
        name = _name;
    }
}
