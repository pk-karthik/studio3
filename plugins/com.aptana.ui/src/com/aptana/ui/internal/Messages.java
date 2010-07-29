package com.aptana.ui.internal;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS
{

	private static final String BUNDLE_NAME = "com.aptana.ui.internal.messages"; //$NON-NLS-1$

	public static String ProjectPropertyTester_ERR_ProjectNature;

	static
	{
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages()
	{
	}
}