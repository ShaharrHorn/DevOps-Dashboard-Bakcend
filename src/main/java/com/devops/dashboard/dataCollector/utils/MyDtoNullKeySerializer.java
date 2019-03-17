package com.devops.dashboard.dataCollector.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class MyDtoNullKeySerializer extends StdSerializer<Object> {
    public MyDtoNullKeySerializer() {
        this(null);
    }
 
    public MyDtoNullKeySerializer(Class<Object> t) {
        super(t);
    }
     
    @Override
    public void serialize(Object nullKey, JsonGenerator jsonGenerator, SerializerProvider unused) 
      throws IOException, JsonProcessingException {
        jsonGenerator.writeFieldName("");
    }
}
