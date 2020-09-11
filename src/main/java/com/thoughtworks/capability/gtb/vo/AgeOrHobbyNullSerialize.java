package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class AgeOrHobbyNullSerialize extends StdSerializer<PersonVo> {

    protected AgeOrHobbyNullSerialize() {
        super(PersonVo.class);
    }

    @Override
    public void serialize(PersonVo person, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("id", person.getId());
        gen.writeNumberField("age", person.getAge() == null ? 0 : person.getAge());
        gen.writeStringField("name", person.getName());
        if (person.getHobby() != null) {
            gen.writeStringField("hobby", person.getHobby());
        }
        gen.writeEndObject();
    }
}
