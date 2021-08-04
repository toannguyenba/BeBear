package com.BeBear.utils.json.parser;

import java.io.IOException;

import org.springframework.boot.jackson.JsonComponent;

import com.BeBear.entities.Productphoto;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@JsonComponent
public class ProductphotoJsonSerializer extends JsonSerializer<Productphoto> {

	@Override
	public void serialize(Productphoto productPhoto, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
		gen.writeStartObject();
		gen.writeStringField("idPhoto", productPhoto.getIdPhoto().toString());
		gen.writeStringField("url", productPhoto.getUrl());
		gen.writeStringField("idProductDetail", productPhoto.getIdProductDetail().getIdProductDetail().toString());
		gen.writeEndObject();
	}

}
