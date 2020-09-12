package com.thoughtworks.capability.gtb.vo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;


import java.io.IOException;
import java.util.Date;

//public class TimeCampSerializer extends StdSerializer<Date> {
//
//    protected TimeCampSerializer() {
//        super(Date.class);
//    }
//
//    @Override
//    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider) throws IOException {
//        gen.writeNumber(date.getTime());
//    }
//}
