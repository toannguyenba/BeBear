package com.BeBear.utils.json.parser;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.BeBear.entities.Productphoto;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@JsonComponent
public class ProductphotoJsonSerializer extends JsonSerializer<Productphoto>{

	@Override
	public void serialize(Productphoto value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		
	}

}
