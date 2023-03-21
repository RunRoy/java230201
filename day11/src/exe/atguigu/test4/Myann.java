package exe.atguigu.test4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lystart
 * @create 2023-02-15 15:51
 */
@Target({ElementType.TYPE_USE, ElementType.METHOD, ElementType.FIELD,ElementType.ANNOTATION_TYPE,ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface Myann {

    int value();

}
