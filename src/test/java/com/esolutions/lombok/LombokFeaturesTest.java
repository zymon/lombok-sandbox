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

    @Test
    public void fluentAccessors() {
        // when
        String name = lombokFeatures.firstName("John").lastName("Rambo").lastName();
        name += ", " + lombokFeatures.firstName();

        // then
        assertThat(name, is("Rambo, John"));
    }

    @Test
    public void builder() {
        // when
        BuilderExample builderExample = BuilderExample.builder().name("John").age(25).build();

        // then
        assertThat(builderExample.getName(), is("John"));
        assertThat(builderExample.getAge(), is(25));
    }

}
