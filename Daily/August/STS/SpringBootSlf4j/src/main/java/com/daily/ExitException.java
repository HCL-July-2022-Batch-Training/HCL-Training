/*August 11, 2022*/

package com.daily;

import org.springframework.boot.ExitCodeGenerator;

public class ExitException extends RuntimeException implements ExitCodeGenerator
{
	private static final long serialVersionUID = 8358829093628638202L;

	public int getExitCode()
	{
		return 10;
	}
}