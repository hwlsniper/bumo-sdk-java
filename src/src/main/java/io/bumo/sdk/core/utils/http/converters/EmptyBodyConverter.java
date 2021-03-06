package io.bumo.sdk.core.utils.http.converters;

import java.io.InputStream;

import io.bumo.sdk.core.utils.http.RequestBodyConverter;
import io.bumo.sdk.core.utils.io.EmptyInputStream;

public class EmptyBodyConverter implements RequestBodyConverter{

    @Override
    public InputStream toInputStream(Object param){
        return EmptyInputStream.INSTANCE;
    }

}
