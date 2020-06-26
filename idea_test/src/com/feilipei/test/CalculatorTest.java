package com.feilipei.test;

import com.feilipei.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jcf
 * @date 2020/6/26 - 23:01
 */
public class CalculatorTest {
    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int add = calculator.add(1, 1);
//        System.out.println(add);
        //断言操作
        Assert.assertEquals(3,add);

    }


}
