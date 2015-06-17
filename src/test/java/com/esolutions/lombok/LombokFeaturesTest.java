package com.esolutions.lombok;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Szymon on 2015-06-17.
 */
public class LombokFeaturesTest {

    private LombokFeatures lombokFeatures;

    @Before
    public void setUp() {
        lombokFeatures = new LombokFeatures();
    }

    @Test (expected = NullPointerException.class)
    public void nonNullAnnotation() {
        // when
        lombokFeatures.nonNull(null);
    }

    @Test
    public void nonNullAnnotationPositive() {
        // given
        String given = "abc";

        // when
        String result = lombokFeatures.nonNull(given);

        // then
        assertThat(result, is(given));
    }

}
