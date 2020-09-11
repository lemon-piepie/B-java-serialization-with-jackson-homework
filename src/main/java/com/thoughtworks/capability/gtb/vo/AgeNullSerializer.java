package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeNullSerializer extends StdSerializer<Integer> {

    protected AgeNullSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(404);
    }
}
