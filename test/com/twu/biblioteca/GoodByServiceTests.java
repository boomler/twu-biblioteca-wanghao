package com.twu.biblioteca;

import com.twu.biblioteca.service.GoodByService;
import org.junit.Assert;
import org.junit.Test;

public class GoodByServiceTests {
    @Test
    public void sayGoodByeTest(){
        Assert.assertEquals("Good Bye!", GoodByService.sayGoodBye());
    }
}
