pragma solidity ^0.4.17;

import "truffle/Assert.sol";
import "truffle/DeployedAddresses.sol";
import "../contracts/Adres.sol";

contract TestAdres {
  function shouldBeEqual() public {
    Assert.equal(1, 1, "1 == 1");
  }
}