var Adres = artifacts.require("./Adres.sol");

module.exports = function(deployer) {
  deployer.deploy(Adres);
};
