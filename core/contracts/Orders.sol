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

    function Order(address _buyer, address _seller, string _name, string _serialNumber, uint256 _timestamp,
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
    
    function getBuyer() public view returns (address) {
        return buyer;
    }

    function setBuyer(address _buyer) public {
        buyer = _buyer;
    }

    function getSeller() public view returns (address) {
        return seller;
    }

    function setSeller(address _seller) public {
        seller = _seller;
    }

    function getName() public view returns (string) {
        return name;
    }

    function setName(string _name) public {
        name = _name;
    }

    function getSerialNumber() public view returns (string) {
        return serialNumber;
    }

    function setSerialNumber(string _serialNumber) public {
        serialNumber = _serialNumber;
    }

    function getTimestamp() public view returns (uint256) {
        return timestamp;
    }

    function setTimestamp(uint256 _timestamp) public {
        timestamp = _timestamp;
    }

    function getWarrantyMilliseconds1() public view returns (uint) {
        return warrantyMilliseconds1;
    }

    function setWarrantyMilliseconds1(uint _warrantyMilliseconds1) public {
        warrantyMilliseconds1 = _warrantyMilliseconds1;
    }

    function getWarrantyMilliseconds2() public view returns (uint) {
        return warrantyMilliseconds2;
    }

    function setWarrantyMilliseconds2(uint _warrantyMilliseconds2) public {
        warrantyMilliseconds2 = _warrantyMilliseconds2;
    }

    function getStatus() public view returns (uint) {
        return status;
    }

    function setStatus(uint _status) public {
        status = _status;
    }

    function getAmount() public view returns (uint) {
        return amount;
    }

    function setAmount(uint _amount) public {
        amount = _amount;
    }
}
