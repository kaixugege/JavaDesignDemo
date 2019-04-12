package annotations;

import java.lang.annotation.Annotation;

public class AnnotaionsDesc implements Description {


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String value() {
        return null;
    }
}
