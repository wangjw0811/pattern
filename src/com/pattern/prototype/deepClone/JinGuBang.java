package com.pattern.prototype.deepClone;

import java.io.Serializable;

/**
 * @author Jims Wang
 * @date 2019-04-21 17:42
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big(){
        this.d *= 2;
        this.h *= 2;
    }
    public void small() {
        this.d /= 2;
    }
}
