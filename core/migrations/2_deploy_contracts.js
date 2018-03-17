var Orders = artifacts.require("./Order.sol");

module.exports = function(deployer) {
  deployer.deploy(Orders);
};
