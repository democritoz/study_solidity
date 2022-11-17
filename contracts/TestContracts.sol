// SPDX-License-Identifier: GPL-30

pragma solidity >= 0.7.0 < 0.9.0;

contract Test001 {

    string public name;
    uint256 public age;

    function setName(string memory _name) public {
        name = _name;
    }

    function setAge(uint _age) public {
        age = _age;
    }

    function getName() public view returns(string memory) {
        return name;
    }

    function getAge() public view returns(uint256) {
        return age;
    }

    function changeAll(string memory _name, uint256 _age) public {
        name = _name;
        age = _age;
    }

}

contract Test002 {

    string public homeAddress;
    string public phoneNumber;

    
}