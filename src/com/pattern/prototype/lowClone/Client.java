package com.pattern.prototype.lowClone;

/**
 * @author Jims Wang
 * @date 2019-04-21 17:07
 */
public class Client {

    private Prototrype prototrype;
    public Client(Prototrype prototrype){
        this.prototrype = prototrype;
    }

    public Prototrype startClone(Prototrype prototrype){
        return prototrype.clone();
    }
}
