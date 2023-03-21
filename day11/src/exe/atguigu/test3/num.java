package exe.atguigu.test3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lystart
 * @create 2023-02-15 13:45
 */

public class num {
    @Test
    public void test(){
//        System.out.println("Test");
        int sum = 0;

    }

    @Before
    public void before(){//在测试方法运行前运行
        System.out.println("in before");
        int[] num = new int[]{1,2,23,4,55,42,3};
    }

    @After
    public void after(){//在测试方法后运行的
        System.out.println("after");
    }
}
