var Order = artifacts.require("./Order.sol");

module.exports = function(deployer) {
  deployer.deploy(Order, 
    '0x627306090abaB3A6e1400e9345bC60c78a8BEf57', 
    '0xf17f52151EbEF6C7334FAD080c5704D77216b732', 
    'Name',
    "Serial Number",
    0, 0, 0, 0, 0
  );
};
