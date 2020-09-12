package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

//public class TimeCampDeserializer extends StdDeserializer<Date> {
//
//    protected TimeCampDeserializer() {
//        super(Date.class);
//    }
//
//    @Override
//    public Date deserialize(JsonParser parser, DeserializationContext context) throws IOException {
//
//    }
//}