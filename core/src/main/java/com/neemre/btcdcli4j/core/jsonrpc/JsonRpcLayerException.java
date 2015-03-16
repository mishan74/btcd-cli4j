package com.neemre.btcdcli4j.core.jsonrpc;

import com.neemre.btcdcli4j.core.CommunicationException;
import com.neemre.btcdcli4j.core.common.Errors;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class JsonRpcLayerException extends CommunicationException {

	private static final long serialVersionUID = 00000001L;

	
	public JsonRpcLayerException(Exception cause) {
		super(cause);
	}
	
	public JsonRpcLayerException(Errors error) {
		super(error); 
	}

	public JsonRpcLayerException(Errors error, Exception cause) {
		super(error, cause);
	}
}