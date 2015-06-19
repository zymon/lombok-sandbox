package com.esolutions.lombok;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by Szymon on 2015-06-17.
 */
public class LombokFeatures {

    public String nonNull(@NonNull String data) {
        return data;
    }

    @Getter @Setter @Accessors(fluent = true)
    private String firstName;
    @Getter @Setter @Accessors(fluent = true)
    private String lastName;
}
