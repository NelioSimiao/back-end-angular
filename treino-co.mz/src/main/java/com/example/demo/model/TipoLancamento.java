package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoLancamento {
	
	RECEITA("RECEITA"),
	DESPESA("DESPESA");
	
	
	
	 private String value;

	TipoLancamento(String value) {
	    this.value = value;
	  }

	  @Override
	  @JsonValue
	  public String toString() {
	    return String.valueOf(value);
	  }

	  @JsonCreator
	  public static TipoLancamento fromValue(String text) {
	    for (TipoLancamento b : TipoLancamento.values()) {
	      if (String.valueOf(b.value).equals(text)) {
	        return b;
	      }
	    }
	    return null;
	  }

}
