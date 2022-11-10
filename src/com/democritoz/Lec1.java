package com.democritoz;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.2.
 */
@SuppressWarnings("rawtypes")
public class Lec1 extends Contract {
    public static final String BINARY = "0x60806040526040518060400160405280600e81526020017f48656c6c6f20536f6c69646974790000000000000000000000000000000000008152506000908161004891906102ab565b5034801561005557600080fd5b5061037d565b600081519050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806100dc57607f821691505b6020821081036100ef576100ee610095565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b6000600883026101577fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8261011a565b610161868361011a565b95508019841693508086168417925050509392505050565b6000819050919050565b6000819050919050565b60006101a86101a361019e84610179565b610183565b610179565b9050919050565b6000819050919050565b6101c28361018d565b6101d66101ce826101af565b848454610127565b825550505050565b600090565b6101eb6101de565b6101f68184846101b9565b505050565b5b8181101561021a5761020f6000826101e3565b6001810190506101fc565b5050565b601f82111561025f57610230816100f5565b6102398461010a565b81016020851015610248578190505b61025c6102548561010a565b8301826101fb565b50505b505050565b600082821c905092915050565b600061028260001984600802610264565b1980831691505092915050565b600061029b8383610271565b9150826002028217905092915050565b6102b48261005b565b67ffffffffffffffff8111156102cd576102cc610066565b5b6102d782546100c4565b6102e282828561021e565b600060209050601f8311600181146103155760008415610303578287015190505b61030d858261028f565b865550610375565b601f198416610323866100f5565b60005b8281101561034b57848901518255600182019150602085019450602081019050610326565b868310156103685784890151610364601f891682610271565b8355505b6001600288020188555050505b505050505050565b6102248061038c6000396000f3fe608060405234801561001057600080fd5b506004361061002b5760003560e01c8063a99dca3f14610030575b600080fd5b61003861004e565b604051610045919061016c565b60405180910390f35b6000805461005b906101bd565b80601f0160208091040260200160405190810160405280929190818152602001828054610087906101bd565b80156100d45780601f106100a9576101008083540402835291602001916100d4565b820191906000526020600020905b8154815290600101906020018083116100b757829003601f168201915b505050505081565b600081519050919050565b600082825260208201905092915050565b60005b838110156101165780820151818401526020810190506100fb565b60008484015250505050565b6000601f19601f8301169050919050565b600061013e826100dc565b61014881856100e7565b93506101588185602086016100f8565b61016181610122565b840191505092915050565b600060208201905081810360008301526101868184610133565b905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806101d557607f821691505b6020821081036101e8576101e761018e565b5b5091905056fea2646970667358221220635a338a4ca00b001bdaf18418d15e3c585ef2befe254bf56673d73e9d571cb264736f6c63430008110033";

    public static final String FUNC_HI = "hi";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<String, String>();
    }

    @Deprecated
    protected Lec1(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Lec1(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Lec1(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Lec1(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<String> hi() {
        final Function function = new Function(FUNC_HI, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    @Deprecated
    public static Lec1 load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Lec1(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Lec1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Lec1(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Lec1 load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Lec1(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Lec1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Lec1(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Lec1> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Lec1.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Lec1> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Lec1.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Lec1> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Lec1.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Lec1> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Lec1.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
