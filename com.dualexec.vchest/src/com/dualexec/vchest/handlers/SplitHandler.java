
package com.dualexec.vchest.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

import com.dualexec.vchest.parts.TestJob;

public class SplitHandler {

	@Execute
	public void execute() {
		System.out.println("Test");

		TestJob job = new TestJob();
		job.schedule();

	}

}