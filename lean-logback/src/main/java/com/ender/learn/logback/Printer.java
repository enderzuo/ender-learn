
package com.ender.learn.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ender.learn.logback.exception.PrinterDivideByThreeException;

public class Printer {

	private static final Logger	LOGGER	= LoggerFactory.getLogger( Printer.class );

	public String print( final String message, final int id ) throws PrinterDivideByThreeException {

		LOGGER.debug( "Message was received to print. Message : {}, Message id : {}", message, id );

		// If the message id is divisible by three, then throw exception.
		if ( id % 3 == 0 ) {
			throw new PrinterDivideByThreeException( "Message id can not be divided by three", id );
		}

		LOGGER.info( "Printing is success. Message id : {}", id );

		return "success";
	}
}
