
package com.ender.learn.logback;

import com.ender.learn.logback.exception.PrinterDivideByThreeException;

public class ApplicationStarter {

	public static void main( final String[] args ) {

		final Printer printer = new Printer();

		// Send ten messages
		for ( int i = 1; i <= 10; i++ ) {

			try {
				printer.print( "Message" + i, i );
			} catch ( final PrinterDivideByThreeException e ) {

			}
		}
	}
}
