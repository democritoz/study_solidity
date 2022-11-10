// SPDX-License-Identifier: GPL-30

pragma solidity >= 0.7.0 < 0.9.0;

contract Lec1 {

    string public hi = "Hello Solidity2223234";

}


contract Lec2 {

    uint256 public testId;

    string public name = "Hello Contract";


    function getName() public returns(string memory) {
        return name;
    }
}