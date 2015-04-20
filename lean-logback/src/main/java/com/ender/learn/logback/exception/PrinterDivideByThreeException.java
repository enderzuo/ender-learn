
package com.ender.learn.logback.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrinterDivideByThreeException extends Exception {

	private static final Logger	LOGGER				= LoggerFactory.getLogger( PrinterDivideByThreeException.class );

	private static final long	serialVersionUID	= 445670554417085824L;

	public PrinterDivideByThreeException( final String message, final int id ) {
		super( message );

		LOGGER.error( "Printing was failed. Message id : {}, Error message: {}", id, message );
	}
}
